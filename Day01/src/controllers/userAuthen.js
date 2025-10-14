import User from "../models/user.js";
import validate from "../utils/validator.js";
import bcrypt from "bcrypt"
import jwt from "jsonwebtoken"
const register=async(req,res)=>{
    try{
    //validate
    console.log(5)
     validate(req.body)
    const{firstName,emailId,password}=req.body
    req.body.password=await bcrypt.hash(password,10);
    const user=await User.create(req.body)
    const token=jwt.sign({_id:user._id,emailId:user.emailId},process.env.JWT_TOKEN,{expiresIn: 60*60});
    // res.cookie('token',token,{expire : new Date(Date.now())})
    res.cookie('token',token,{maxAge: 60*60*1000})
    res.status(201).send("User Registered successfully")
    }
    catch(err){
        console.log("Error: "+err.message)
        res.status(400).send("Error occured")
    }
}
const login=async(req,res)=>{
    try{
        const {emailId,password}=req.body
        if(!emailId){
            throw new Error("Invalid Credentials")
        }
        if(!password){
            throw new Error("Invalid Credentials")
        }
        const user=await User.findOne({emailId})
         const match=bcrypt.compare(password,user.password)
         if(!match){
            throw new Error("Invalid Password")
         }
          const token=jwt.sign({_id:user._id,emailId:emailId},process.env.JWT_TOKEN,{expiresIn: 60*60});
          res.cookie('token',token,{maxAge: 60*60*1000})
          res.send("Logged in successfully")
    }
    catch(err){
        res.status(401).send("Error: "+err)
    }
}
export {register,login}