import express from 'express'
const problemRouter=express.Router()
problemRouter.post("/create",problemCreate)
problemRouter.get("/:id",problemfetch)
problemRouter.get("/",problemFetchAll)
problemRouter.get("/user",solvedPrblem)
problemRouter.patch("/:id",problemUpdate)
problemRouter.delete("/:id",problemDelete)