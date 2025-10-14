import express from 'express';
const app=express()
import dotenv from 'dotenv'
import cookieParser from 'cookie-parser'
import main from './config/db.js';
import User from './models/user.js';
import authRouter from './routes/userAuth.js';
dotenv.config()


app.use(express.json())// to convert json data in req.body to object
app.use(cookieParser())
console.log(1)
app.use("/auth",authRouter)
console.log(2)
main()
.then(async()=>{
    app.listen(process.env.PORT,()=>{
        console.log("Server listening at port number: "+process.env.PORT)
    })
})
.catch(err=>console.log("Error Occured:"+err))