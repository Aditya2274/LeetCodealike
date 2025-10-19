import express from 'express'
import {register,login,logout} from "../controllers/userAuthen.js"
import userMiddleware from '../middleware/userMiddleware.js'
const authRouter= express.Router()
//Register
console.log(3)
authRouter.post("/register",register);
console.log(4)
//login
authRouter.post("/login",login);
//logout
authRouter.post("/logout",userMiddleware,logout);
// authRouter.post("/logout",logout);
//GetProfile
// authRouter.get("/GetProfile",GetProfile);
export default authRouter