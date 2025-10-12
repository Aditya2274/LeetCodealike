import User from "../models/user.js";
import validate from "../utils/validator.js";
const register=async(req,res)=>{
    try{
    //validate
     validate(req.body)
    const{firstName,emailId,password}=req.body
    await User.create(req.body)
    }
    catch(err){
        console.log("Error: "+err.message)
    }
}
export default register