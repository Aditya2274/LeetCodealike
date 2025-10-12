import express from 'express';
const app=express()
import dotenv from 'dotenv'
import cookieParser from 'cookie-parser'
import main from './config/db.js';
import User from './models/user.js';
dotenv.config()


app.use(express.json())// to convert json data in req.body to object
app.use(cookieParser())

main()
.then(async()=>{
    app.listen(process.env.PORT,()=>{
        console.log("Server listening at port number: "+process.env.PORT)
    })
})
.catch(err=>console.log("Error Occured:"+err))