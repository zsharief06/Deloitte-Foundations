const express = require('express');
const mongoose = require('mongoose');
const bcrypt = require('bcrypt');

const User = require('./models/User');

const app = express();
const PORT= 3000;
app.use(express.json());

const mongoURI = 'mongodb+srv://zsharief06:vDit5yCpEzDk8vZd@cluster0.x3opf.mongodb.net/testDB?retrywrites=true&w=majority';
mongoose.connect(mongoURI)
    .then(()=> console.log( 'MONGODB CONNECTED' ))
    .catch(err=> console.log(err));

app.get('/',(req,res)=>{
        res.send('Connected to MongoDB');
        })

        app.get('/api/users', async (req,res)=>{
            try{
                const users = await User.find();
                res.json(users);
                } catch(err){
                        res.status(500).send(err);
                        }
                        });
                                                 
                        app.post('/api/users',async (req,res)=>{
                                try{
                                            const userData = req.body;
                                                    const user = await User.create(userData);
                                                            res.status(201).json(user);
                                                                    } catch(err){
                                                                                res.status(500).send(err);
                                                                    }
                                                                })
