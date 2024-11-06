const mongoose = require('mongoose');
const bcrypt = require('bcrypt');
 
const UserSchema = new mongoose.Schema({
      username: {
                type: String,
                        required:true
                            },
                                email: {
                                          type: String,
                                                  required: true,
                                                          unique: true
                                },
                                    password: {
                                              type: String,
                                                      required: true,
                                                              minLength: 8
                                                                  }
                                                                  });
                                                                  UserSchema.pre("save", async function () {
                                                                            this.password = await bcrypt.hash(this.password, 12);
                                                                  });
                                                                   
                                                                   MediaSourceHandle.exports = mongoose.model('User', UserSchema);
                                                                                                                                                   
                                                                    
                      