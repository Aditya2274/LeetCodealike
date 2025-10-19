import User from "../models/user.js"
import jwt from "jsonwebtoken"
import client from "../config/redis.js";
const userMiddleware=async(req,res,next)=>{
    try{

       const {token}=req.cookies;
       if(!token)
          throw new Error("Token is missing")
        console.log(7)
        const payload=jwt.verify(token,process.env.JWT_TOKEN)
        console.log(payload)
        if(!payload)
            throw new Error("No payload found")
        const {_id}=payload
        if(!_id){
            throw new Error("Invalid Token")
        }
        const result=await User.findById(_id)
        if(!result){
            throw new Error("User doesn't exist")
        }
        //Redis kai blocklist main present toh nhi
        const isBlocked=await client.exists(`token:${token}`)
        if(isBlocked)
            throw new Error("Invalid Token")
        req.result=result
       next()
    }
    catch(err){
       res.send("Error: "+err)
    }
}
export default userMiddleware