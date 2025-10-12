import mongoose from "mongoose";
const {Schema}=mongoose
const userschema=new Schema({
    firstName:{
        type:String,
        required:true,
        minLength:3,
        maxLength:20
    },
    lastName:{
        type:String,
        minLength:3,
        maxLength:20
    },
    emailId:{
        type:String,
        required:true,
        unique:true,
        trim:true,
        lowercase:true,
        immutable:true
    },
    age:{
        type:Number,
        min:6,
        max:80
    },
    role:{
        type:String,
        enum:['user','admin'],
        default:'user'
    },
    problemsolved:{
        type:[String]
    },
    password:{
        type:String,
        minLength:8,
        required:true
    }
},{timestamps: true})
const User=mongoose.model("user",userschema)
export default  User