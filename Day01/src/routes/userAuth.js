import express from 'express'
const authRouter= express.Router()
//Register
authRouter.post("/register",register);
//login
authRouter.post("/login",login);
//logout
authRouter.post("/logout",logout);
//GetProfile
authRouter.get("/GetProfile",GetProfile);