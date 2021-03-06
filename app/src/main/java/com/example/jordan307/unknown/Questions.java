package com.example.jordan307.unknown;

public class Questions {

    public int getLength() {
        return GameDataArray[0].length;
    }


    private String GameDataArray[][][][][] = {
            //Scenario Level 1
            {
                    {//question
                            {{"You open your eyes and can't remember anything. You are so hungry and need to eat something as soon as possible, you are at a camp site and notice some old food lying around. An apple that is soft to the touch, some moldy bread and some meat."}, {""}}
                    },
                    {//options
                            {{"Eat the Bread"}, {""}},
                            {{"Eat the Meat"}, {""}},
                            {{"Eat the Apple"}, {""}}
                    },
                    {//answer effects
                            {{"Pos"}, {"5"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"It's rock solid, but anything will do, you hope this mold is not poisonous."}, {""}},
                            {{"You eat the meat and feel violently ill, it was rotten, you throw up."}, {""}},
                            {{"it's a little old but tastes good you eat the whole thing core and all!"}, {""}}
                    }
            },

            //Scenario Level 2
            {
                    {//question
                            {{"Your vision is a little blurry but you can see something moving in the distance. You don't know how you got outside or what is happening."}, {""}}
                    },
                    {//options
                            {{"Pour water over your eyes"}, {""}},
                            {{"Approach object"}, {""}},
                            {{"Hide behind camp tent to get a better look"}, {""}}

                    },
                    {//answer effects
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You can see clearly and don't see anything."}, {""}},
                            {{"As you approach you realize what you are seeing is not of this world. It screams and passes right through you before vanishing"}, {""}},
                            {{"It appears to be a person but it Banishes before you are sure, you feel a chill down your spine"}, {""}}
                    }
            },

            //Scenario Level 3
            {
                    {//question
                            {{"You aren't sure if what you just saw was real or you are hallucinating you need to find a clue and try to remember. You are in the middle of the campsite with a small village ahead and a forest behind you."}, {"0"}}
                    },
                    {//options
                            {{"Search Forest For Clues"}, {"0"}},
                            {{"Search Town for Clues"}, {"0"}},
                            {{"Search campsite for clues"}, {"0"}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You come across a dead body in the forest with no wounds and white eyes. You hurry back to camp where you remember your backpack might be"}, {""}},
                            {{"You don't find anything but feel as though something is watching you constantly, you hurry back to camp where you remember seeing your backpack."}, {""}},
                            {{"You find your backpack. A feeling of releif washes over you."}, {""}}
                    }
            },

            //Scenario Level 4
            {
                    {//question
                            {{"You take your backpack that contains your belongings, you find your phone and view messages in an attempt to remember what happened last. You see a message from a friend. They have surrounded me, 37.8136° S, 144.9631° E"}, {""}}
                    },
                    {//options
                            {{"Find boat"}, {""}},
                            {{"Find bike"}, {""}},
                            {{"Find a vehicle"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"We're not near water! We will find a vehicle"}, {""}},
                            {{"It's going to take some time to reach that destination"}, {""}},
                            {{"The car you found has an engine running at half capacity"}, {""}}
                    }
            },

            //Scenario Level 5
            {
                    {//question
                            {{"You arrive at the destination, you see your friend is in trouble. He is running for his life, he trips and falls to the ground in pain. He looks injured and there are spirits approaching fast."}, {""}}
                    },
                    {//options
                            {{"Run spirits over"}, {""}},
                            {{"Lure the spirits to another direction"}, {""}},
                            {{"Drive to friend"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"5"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"That was no use! They're transparant and can't be killed. Instead you pick Trevor up and drive away."}, {""}},
                            {{"It's worked but Trevor can't move much. You quickly turn back and carry him to the car."}, {""}},
                            {{"You drive straight to Trevor, lift him up and drive off in the car"}, {""}}
                    }
            },

            //Scenario Level 6
            {
                    {//question
                            {{"Your friend has a wound to their leg, they need to reduce the pain and swelling fast. You know you can't stop driving but need to help your friend."}, {""}}
                    },
                    {//options
                            {{"Give water to your friend without turning around"}, {""}},
                            {{"Ignore your friend"}, {""}},
                            {{"Turn around to hand your friend water"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"10"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"The water pours out everywhere, you have lost most of your supply"}, {""}},
                            {{"Your friend is still in pain"}, {""}},
                            {{"You helped your friend reduce the pain"}, {""}}
                    }
            },

            //Scenario Level 7
            {
                    {//question
                            {{"Your friend takes your backpack and jumps out of the car while it's moving. The road ahead is blocked off by fallen trees and destroyed vehicles."}, {""}}
                    },
                    {//options
                            {{"Ditch the car, go after your friend"}, {""}},
                            {{"Ditch the car, run to nearby river"}, {""}},
                            {{"Ditch the car, quietly go to nearby river"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"It's too late for that, your friend is long gone. Head to the river. "}, {""}},
                            {{"Some of the spirits might have heard you but you are unsure"}, {""}},
                            {{"You drink the fresh running water. It gives you time to think about what just happened"}, {""}}
                    }
            },

            //Scenario Level 8
            {
                    {//question
                            {{"It will be night time soon, you will need to find food and a place to sleep. You see what used to be a shopping centre in the distance, they should have backpacks in their but most likely spirits will be around. "}, {""}}
                    },
                    {//options
                            {{"Don't take the risk"}, {""}},
                            {{"Go back to the car"}, {""}},
                            {{"Go to the shopping centre"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"You need supplies, without this you would not survive. You head to the shopping centre"}, {""}},
                            {{"You need supplies, without this you would not survive. You head to the shopping centre"}, {""}},
                            {{"You find a backpack, a sleeping bag and tin canned food. "}, {""}}
                    }
            },

            //Scenario Level 9
            {
                    {//question
                            {{"You remember seeing an isolated house not far from here on your drive. It's dangerous to travel at night but it's not safe to also stay here. It will take stealth, strength and courage to survive outside at night. There is no easy way out of this. "}, {""}}
                    },
                    {//options
                            {{"Take your time heading to the house"}, {""}},
                            {{"Try to avoid being seen by spirits"}, {""}},
                            {{"Run as fast as you can to the house"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"There is no time! Spirits can sense your presence. You make it to the house in a panic"}, {""}},
                            {{"You took a bit longer than you should have but you made it"}, {""}},
                            {{"Getting their at night as quick as possible was a good idea"}, {""}}
                    }
            },

            //Scenario Level 10
            {
                    {//question
                            {{"You shut all windows and doors. You hear them outside but you can't see them. You are starting to feel anxious and paranoid that they may know you're inside the house. You see a fireplace upstairs in the main living room, there are logs of wood with a lighter nearby it."}, {""}}
                    },
                    {//options
                            {{"Do not light the fireplace"}, {""}},
                            {{"You are a bit cold but it will have to do for now"}, {""}},
                            {{"Take the wood pile and light the fireplace"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"40"}},
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You are really cold and find it difficult to sleep."}, {""}},
                            {{"You are a bit cold but it will have to do for now"}, {""}},
                            {{"You are nice and warm, you feel comfortable in your sleeping bag and fall asleep"}, {""}}
                    }
            },

            //Scenario Level 11
            {
                    {//question
                            {{"A new day is here, you see a thin book on a desk in the study and decide to read it. It has three different methods to ward off spirits and you know you have to try one of them! You find the materials for each method around the house."}, {""}}
                    },
                    {//options
                            {{"Light incense candles"}, {""}},
                            {{"Mark each door with ash from the fireplace"}, {""}},
                            {{"Salt all of the entrances of the building"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"100"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"The Incence candles empower the spirits they enter the house and drain the life from you"}, {""}},
                            {{"You can still hear the spirits the ash does not seem to have worked"}, {""}},
                            {{"The spirits grow quiet you have warded them off for now it seems"}, {""}}
                    }
            },

            //Scenario Level 12
            {
                    {//question
                            {{"You can't stay in this house and need to make your next move you assess the house for supplies and find a radio which you can call for help with but you arent sure how the spirits will react to it, you feel they might still be near by."}, {""}}
                    },
                    {//options
                            {{"Use the Radio"}, {""}},
                            {{"Sneak out of the house and get as far as you can before trying the radio"}, {""}},
                            {{"Look around for more clues"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"50"}},
                            {{"Pos"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"You can hear a faint voice saying 10,10 Oakville but the spirits hear the radio signals and track your position down and start screaming at you through the radio"}, {""}},
                            {{"You get a fix on a radio channel and hear a faint voice muttering 10, 10 oakville."}, {""}},
                            {{"You find a note left by another survivor 10, 10 oakville is safe get there as fast as you can!"}, {""}}
                    }
            },

            //Scenario Level 13
            {
                    {//question
                            {{"The spirits come into the house, they must have heard the radio signal! You jump out through the window and see one right in front of you. It's coming towards you."}, {""}}
                    },
                    {//options
                            {{"Run through the spirit"}, {""}},
                            {{"Duck"}, {""}},
                            {{"Run around the spirit"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"100"}},
                            {{"Neg"}, {"30"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"The spirit takes control of your body, every muscle, every organ and drains the life from you. "}, {""}},
                            {{"You managed to avoid the spirit barely but it is still after you"}, {""}},
                            {{"You managed to avoid the spirit barely but it is still after you"}, {""}}
                    }
            },

            //Scenario Level 14
            {
                    {//question
                            {{"You sense and feel death. Whispers in the distance, you're starting to lose your sanity. What's the point anymore? You think to yourself. It's not worth living in a world that is unliveable. "}, {""}}
                    },
                    {//options
                            {{"Let the spirits take your soul"}, {""}},
                            {{"Think of Oakville"}, {""}},
                            {{"Think of a memory"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"100"}},
                            {{"Pos"}, {"10"}},
                            {{"Pos"}, {"20"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You just couldn't take it anymore, the spirits overcame your sanity. "}, {""}},
                            {{"You reminded yourself that you need to get to Oakville as there is still hope"}, {""}},
                            {{"You reminded yourself of a positive memory back when things were normal"}, {""}}
                    }
            },

            //Scenario Level 15
            {
                    {//question
                            {{"You quickly snap out and see your friend who stole your backpack trapped by spirits with no escape. They will not survive unless you intervene and do something. "}, {""}}
                    },
                    {//options
                            {{"Let your friend die"}, {""}},
                            {{"Scream to get the spirits attention"}, {""}},
                            {{"Go over and help"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"50"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"It's come to this, not even caring about human life anymore and just saving yourself. "}, {""}},
                            {{"It's too late, your friend didn't make it."}, {""}},
                            {{"It's too late, your friend didn't make it. "}, {""}}
                    }
            },

            //Scenario Level 16
            {
                    {//question
                            {{"You run along the river, the spirits are getting closer. There is a boat near the river, you use it and head down the rivers path. You see bodies of lost souls in the river. "}, {""}}
                    },
                    {//options
                            {{"Look away"}, {""}},
                            {{"Close your eyes"}, {""}},
                            {{"Face reality"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"20"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"You keep your eyes open to see where you're heading. You didn't look as it it would hurt you to see so many lives lost."}, {""}},
                            {{"You can't see where you're going! But at least you don't see the dead bodies"}, {""}},
                            {{"You see all the bodies in the river, it makes you shiver and nearly vomit. You suddenly start to feel sick."}, {""}}
                    }
            },

            //Scenario Level 17
            {
                    {//question
                            {{"You reach the end of the river bank. It's dead quiet, no spirits either. You are grabbed from behind in a choke hold with a weapon up against your back. "}, {""}}
                    },
                    {//options
                            {{"We're both survivors, get the hell off me!"}, {""}},
                            {{"Please don't! I am travelling to Oakville"}, {""}},
                            {{"Please don't! I'll give you my backpack"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"You are killed. "}, {""}},
                            {{"they don't care where you're going. They tell you to give them your belongings. "}, {""}},
                            {{"They seem satisfied with this and you take off your backpack. "}, {""}}
                    }
            },
            //Scenario Level 18
            {
                    {//question
                            {{"The person releases you from their hold. You give up your backpack and shoes in return for a lift to Oakville. "}, {""}}
                    },
                    {//options
                            {{"Try to take their car keys and run"}, {""}},
                            {{"Ask if you can drive"}, {""}},
                            {{"Stay quiet and get in the car"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"Bad idea, he is now angry at you for trying that!"}, {""}},
                            {{"Are you crazy? Don't push it"}, {""}},
                            {{"You realise sometimes saying less is a better idea"}, {""}}
                    }
            },

            //Scenario Level 19
            {
                    {//question
                            {{"You arrive at a destination that is not Oakville. You get increasingly nervous and anxious. The person ties you up to a tree outside and drives away. In the distance you see spirits coming, you do not have much time. "}, {""}}
                    },
                    {//options
                            {{"Keep quiet and do nothing"}, {""}},
                            {{"Bite knot of rope"}, {""}},
                            {{"Attempt to untie knot of rope"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"Are you asking for death?"}, {""}},
                            {{"This took some time but you managed to free yourself "}, {""}},
                            {{"You untied the knot successfully! "}, {""}}
                    }
            },

            //Scenario Level 20
            {
                    {//question
                            {{"You managed to untie yourself from the tree. You can see an island just off the lake in the distance, it's Oakville! You have nearly made it!"}, {""}}
                    },
                    {//options
                            {{"Don't go to Oakville"}, {""}},
                            {{"Find boat to float to Oakville"}, {""}},
                            {{"Swim to Oakville!"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"10"}},
                            {{"Pos"}, {"20"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You want a chance to survive or not? Start swimming!"}, {""}},
                            {{"There aren't any boats around and it's not that far. "}, {""}},
                            {{"Lucky you know how to swim! You arrive safely to the island. "}, {""}}
                    }
            },

            //Scenario Level 21
            {
                    {//question
                            {{"You arrive at the pier on the island of Oakville. Nothing but silence fills the air.. you notice there are two directions."}, {""}}
                    },
                    {//options
                            {{"Go back to main land"}, {""}},
                            {{"Go left"}, {""}},
                            {{"Go right"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"The whole reason was to go to Oakville! You are\n" +
                                    "losing your mind."}, {""}},
                            {{"Wrong turn but you eventually find the\n" +
                                    "right path."}, {""}},
                            {{"Good choice, follow the path ahead. "}, {""}}
                    }
            },

            //Scenario Level 22
            {
                    {//question
                            {{"You walk through the small town and see no one. Was the radio signal wrong about the location? You hear a frequency signal coming from one of the buildings. "}, {""}}
                    },
                    {//options
                            {{"Don't follow the signal"}, {""}},
                            {{"Check if anyone is in the building"}, {""}},
                            {{"Follow the signal"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"What are you going to do now then? "}, {""}},
                            {{"This is dangerous, you don't know where\n" +
                                    "you are going. "}, {""}},
                            {{"It seems to be the only choice to make\n" +
                                    "right now. "}, {""}}
                    }
            },

            //Scenario Level 23
            {
                    {//question
                            {{"The signal all of a sudden goes silent. You're now in the building, it's dark and hard to see anything. There are objects on the ground. "}, {""}}
                    },
                    {//options
                            {{"Candle"}, {""}},
                            {{"Stick"}, {""}},
                            {{"Torch"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Water"}, {""}},
                            {{"Watwr"}, {""}}
                    },
                    {//result dialog
                            {{"It will melt in your hand. You pick up the torch\n" +
                                    "instead"}, {""}},
                            {{"Lucky you found a lighter with it, you light\n" +
                                    "the match and can see your surroundings"}, {""}},
                            {{"You turn it on and can now see your \n" +
                                    "surroundings"}, {""}}
                    }
            },

            //Scenario Level 24
            {
                    {//question
                            {{"You turn on the torch to see a person holding a radio, it must be the same person who contacted me earlier. He turns around and says \"You don't get it do you?\""}, {""}}
                    },
                    {//options
                            {{"Is this some sort of joke?"}, {""}},
                            {{"What?"}, {""}},
                            {{"Don't get what?"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You do not keep calm and the situation is getting\n" +
                                    "out of control"}, {""}},
                            {{"You try to keep calm. "}, {""}},
                            {{"You try to keep calm and take control\n" +
                                    "of the situation"}, {""}}
                    }
            },

            //Scenario Level 25
            {
                    {//question
                            {{"He replies \"I made this happen, the spirits work for me\" All of a sudden hundreds of spirits surround the building"}, {""}}
                    },
                    {//options
                            {{"Run for a chance to survive"}, {""}},
                            {{"How did you do this?"}, {""}},
                            {{"Why did you do this?"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You won't make it out in time. You decide it \n" +
                                    "wouldn't be a good idea and try to talk your way out"}, {""}},
                            {{"This is not important right now, you need\n" +
                                    "to convince him not to kill you."}, {""}},
                            {{"Your life is in danger, you need to find\n" +
                                    "a way to convince him not to kill you."}, {""}}
                    }
            },

            //Scenario Level 26
            {
                    {//question
                            {{"\"Humans destroyed this world with their plastic waste, toxic carbon monoxide and more! That's why the apocalypse happened. Now I'm wiping out the race in order for the world to be at peace\" "}, {""}}
                    },
                    {//options
                            {{"Run for a chance to survive"}, {""}},
                            {{"Wait, don't do this"}, {""}},
                            {{"Wait, I can help you"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You won't make it out in time. You decide it \n" +
                                    "wouldn't be a good idea and try to talk your way out"}, {""}},
                            {{"This isn't helping, he does not seem like\n" +
                                    "he cares."}, {""}},
                            {{"You wait for his answer in hope that\n" +
                                    "he will let you go."}, {""}}
                    }
            },

            //Scenario Level 27
            {
                    {//question
                            {{"\"I experimented with people after they have passed, I found a way to bring them back. I don't need your help\" Spirits enter the building and are about to touch me, there is nowhere to go or hide. "}, {""}}
                    },
                    {//options
                            {{"Run for your life!"}, {""}},
                            {{"Plead for your life"}, {""}},
                            {{"Close your eyes"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You won't make it out in time. You decide it \n" +
                                    "wouldn't be a good idea and try to talk your way out"}, {""}},
                            {{"This isn't helping, he does not seem like\n" +
                                    "he cares."}, {""}},
                            {{"I give up until I realise when I close my\n" +
                                    "eyes, they cannot take my soul. "}, {""}}
                    }
            },

            //Scenario Level 28
            {
                    {//question
                            {{"You closed your eyes and can feel the spirits touching you and around you. Nothing has happened, maybe I'm safe if i keep my eyes closed. This is my chance to escape. "}, {""}}
                    },
                    {//options
                            {{"Open your eyes to see the exit"}, {""}},
                            {{"Keep your eyes closed"}, {""}},
                            {{"Run with your eyes closed"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You just gave the spirits your soul "}, {""}},
                            {{"No point standing there! Run for it!"}, {""}},
                            {{"Now is your chance! Get out of there!"}, {""}}
                    }
            },

            //Scenario Level 29
            {
                    {//question
                            {{"I managed to get out with my eyes closed. I need remember which way I took to come here, it would be in reverse. "}, {""}}
                    },
                    {//options
                            {{"Straight"}, {""}},
                            {{"Right"}, {""}},
                            {{"Left"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"No reach a dead end and are killed by the spirits"}, {""}},
                            {{"No! Wrong way! You then go left."}, {""}},
                            {{"Nice one! You're nearly out of there"}, {""}}
                    }
            },

            //Scenario Level 30
            {
                    {//question
                            {{"I opened my eyes for a quick second to look back and I see a power source that the spirits seem to gravitate towards. "}, {""}}
                    },
                    {//options
                            {{"Leave Oakville island"}, {""}},
                            {{"Head back and speak to the person "}, {""}},
                            {{"Head back and destroy the power source"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"15"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"You need to try to find the source! Else you will \n" +
                                    "never live in peace. "}, {""}},
                            {{"He will try to kill you if you do that. "}, {""}},
                            {{"This is your last chance of any hope of\n" +
                                    "surviving "}, {""}}
                    }
            },

            //Scenario Level 31
            {
                    {//question
                            {{"I turn around with my eyes open and run towards th power source. The spirits have now spotted me, I need to decide fast and unplug one of the 3 cables."}, {""}}
                    },
                    {//options
                            {{"Unplug yellow cable. "}, {""}},
                            {{"Unplug red cable"}, {""}},
                            {{"Unplug blue cable"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"An explosion occurs and you are killed.\n"}, {""}},
                            {{"Lucky you remember reading about cables as\n" +
                                    "an electrician and decide to cut the blue \n" +
                                    "one first instead."}, {""}},
                            {{"You remember reading about cables as\n" +
                                    "an electrician. "}, {""}}
                    }
            },

            //Scenario Level 32
            {
                    {//question
                            {{"It was no use! Try another cable before the spirits reach you! "}, {""}}
                    },
                    {//options
                            {{"Leave Oakville island"}, {""}},
                            {{"Unplug yellow cable"}, {""}},
                            {{"Unplug red cable"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Water"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"There is no point leaving if you will never be at \n" +
                                    "peace. "}, {""}},
                            {{"You realised just in time that the next one\n" +
                                    "that should be unplugged is the red cable"}, {""}},
                            {{"The spirits are too close, one cable\n" +
                                    "to go!"}, {""}}
                    }
            },

            //Scenario Level 33
            {
                    {//question
                            {{"That didn't seem to work either. The spirits are about to touch you, you need to think fast."}, {""}}
                    },
                    {//options
                            {{"Close eyes and run"}, {""}},
                            {{"Close eyes "}, {""}},
                            {{"Close eyes and unplug red cable"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You have now lost all hope, you should of cut the\n" +
                                    "last cable. "}, {""}},
                            {{"Do something, don't just stand there. You \n" +
                                    "unplug the last cable"}, {""}},
                            {{"Done! But something must of gone \n" +
                                    "wrong. "}, {""}}
                    }
            },

            //Scenario Level 34
            {
                    {//question
                            {{"You unplug the last cable and you can still hear the power source is on. It didn't work, you then run with your eyes closed to escape from the spirits. "}, {""}}
                    },
                    {//options
                            {{"Let them take your soul"}, {""}},
                            {{"Open your eyes"}, {""}},
                            {{"Keep your eyes closed"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"100"}},
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"15"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You have lost all hope and give up. "}, {""}},
                            {{"You see a spirit coming very close to\n" +
                                    "touching you and close your eyes. "}, {""}},
                            {{"They can't do anything but you also\n" +
                                    "cannot see. "}, {""}}
                    }
            },

            //Scenario Level 35
            {
                    {//question
                            {{"You don't know where you're going. You can sense the sun is going down and it will be dark again soon. You open your eyes to see places to hide. "}, {""}}
                    },
                    {//options
                            {{"Hide up a tree"}, {""}},
                            {{"Hide in a building"}, {""}},
                            {{"Hide in a barrel "}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"The spirits will be able to float up and kill you. "}, {""}},
                            {{"You will be trapped and it's too obvious\n" +
                                    "of a spot to hide. "}, {""}},
                            {{"This seems like they wouldn't expect\n" +
                                    "it. "}, {""}}
                    }
            },

            //Scenario Level 36
            {
                    {//question
                            {{"You jump inside a barrel and hide. Luckily you can put the lid over it as there are holes for breathing on the sides of the barrel. "}, {""}}
                    },
                    {//options
                            {{"Move by rolling inside the barrel"}, {""}},
                            {{"Be on the lookout"}, {""}},
                            {{"Go to sleep"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"This is a bad idea, you could roll into danger. "}, {""}},
                            {{"You can't see anything so you decide\n" +
                                    "to try and sleep instead. "}, {""}},
                            {{"You need rest, you can think about\n" +
                                    "how to destroy the power source \n" +
                                    "tomorrow."}, {""}}
                    }
            },

            //Scenario Level 37
            {
                    {//question
                            {{"You wake up to the sunlight in your face coming through the small holes in the barrel. You go to push off the lid but cannot. "}, {""}}
                    },
                    {//options
                            {{"Move back and forth in the barrel"}, {""}},
                            {{"Push the barrel on its side "}, {""}},
                            {{"Try to push it off again. "}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"There is not enough room to jump. "}, {""}},
                            {{"You can't stay in it forever, you decide\n" +
                                    "to push the lid off. "}, {""}},
                            {{"You successfully got it off!"}, {""}}
                    }
            },

            //Scenario Level 38
            {
                    {//question
                            {{"You manage to push off the lid, the second time. You hop out of the barrel and see the person with the radio staring at you. "}, {""}}
                    },
                    {//options
                            {{"What do you want!"}, {""}},
                            {{"Go away!"}, {""}},
                            {{"Leave me alone!"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"20"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You have gotten him angry and wait for\n" +
                                    "his response. "}, {""}},
                            {{"You wait for his response. "}, {""}},
                            {{"You wait for his response. "}, {""}}
                    }
            },

            //Scenario Level 39
            {
                    {//question
                            {{"He says \"I'm here to watch you die\" You cannot escape this place, this is home of where it all started. "}, {""}}
                    },
                    {//options
                            {{"Run away"}, {""}},
                            {{"Throw the barrel at the person"}, {""}},
                            {{"Run at the person to fight"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Water"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"You can't leave now, it's your chance to finally\n" +
                                    "end this. "}, {""}},
                            {{"It's too heavy to throw"}, {""}},
                            {{"You charge at him in an attempt to \n" +
                                    "take him down."}, {""}}
                    }
            },

            //Scenario Level 40
            {
                    {//question
                            {{"You lose the fight, he is on top of you holding you down. He says \"You have a strong soul, they really want to take yours\" "}, {""}}
                    },
                    {//options
                            {{"Try to push him off you"}, {""}},
                            {{"Grab the stick next to you"}, {""}},
                            {{"Grab the rock next to you."}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Hunger"}, {""}}
                    },
                    {//result dialog
                            {{"He is stronger than you, this does not work. "}, {""}},
                            {{"This doesn't have much effect so you \n" +
                                    "grab a rock instead."}, {""}},
                            {{"You hit him in the head with the rock. "}, {""}}
                    }
            },

            //Scenario Level 41
            {
                    {//question
                            {{"You manage to hit him over the head with the rock. You then run for your life to try and leave the island but when you get close to the pier you see spirits have created a border that cannot be passed."}, {""}}
                    },
                    {//options
                            {{"Run through spirits "}, {""}},
                            {{"Give up "}, {""}},
                            {{"Go back "}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"100"}},
                            {{"Neg"}, {"100"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You are killed. "}, {""}},
                            {{"You consider this thought but persist "}, {""}},
                            {{"You decide it's too late to leave now"}, {""}}
                    }
            },

            //Scenario Level 42
            {
                    {//question
                            {{"You go back and hide in one of the buildings in the small town. It's only a matter of time before they find you. "}, {""}}
                    },
                    {//options
                            {{"Give up "}, {""}},
                            {{"Hide somewhere in the building"}, {""}},
                            {{"Look around for resources"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You are killed. "}, {""}},
                            {{"They know you are in there, you need to\n" +
                                    "protect yourself. "}, {""}},
                            {{"You need to find an object to protect\n" +
                                    "yourself."}, {""}}
                    }
            },

            //Scenario Level 43
            {
                    {//question
                            {{"You hear the door open into the building, it's like they can sense your presence to know where you are. You know your chance of survival has dropped drastically. "}, {""}}
                    },
                    {//options
                            {{"Give up "}, {""}},
                            {{"Try to hide somewhere"}, {""}},
                            {{"Try to calm yourself down"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Pos"}, {"5"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You are killed. "}, {""}},
                            {{"They know you are in there, you need to\n" +
                                    "protect yourself. "}, {""}},
                            {{"You try not to panic in this situation\n" +
                                    "and remain calm."}, {""}}
                    }
            },

            //Scenario Level 44
            {
                    {//question
                            {{"You see a desk in a room of the building, it may have some useful resources to survive. You have some time to find anything to help you"}, {""}}
                    },
                    {//options
                            {{"Don't search"}, {""}},
                            {{"Look elsewhere"}, {""}},
                            {{"Search the desk"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"20"}},
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"Your chances of survival have dropped incredibly \n" +
                                    "low. "}, {""}},
                            {{"There seems to be nothing else around."}, {""}},
                            {{"This may be your last chance to\n" +
                                    "survive"}, {""}}
                    }
            },

            //Scenario Level 45
            {
                    {//question
                            {{"You see some bricks in the corner of one of the rooms. This may be helpful in protecting yourself from the person coming in soon."}, {""}}
                    },
                    {//options
                            {{"Don't pick it up"}, {""}},
                            {{"It's too heavy"}, {""}},
                            {{"Hold a brick"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Pos"}, {"5"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Hunger"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You still have nothing to protect yourself. "}, {""}},
                            {{"You think it's not a good weapon because\n" +
                                    "of it's weight"}, {""}},
                            {{"You pick up the brick."}, {""}}
                    }
            },

            //Scenario Level 46
            {
                    {//question
                            {{"You aren't sure whether to pick up a brick so you see glass shattered on the ground. Should you pick it up instead and use it as protection? "}, {""}}
                    },
                    {//options
                            {{"Don't pick it up "}, {""}},
                            {{"It's too sharp"}, {""}},
                            {{"Pick up glass instead"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"10"}},
                    },
                    {//answer types
                            {{"Hunger"}, {""}},
                            {{"Water"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You are now in serious danger with no protection"}, {""}},
                            {{"You pick it up carefully"}, {""}},
                            {{"This is a better choice of weapon"}, {""}}
                    }
            },

            //Scenario Level 47
            {
                    {//question
                            {{"You hear the footsteps coming closer, your heart is racing and you are too anxious to decide. "}, {""}}
                    },
                    {//options
                            {{"Do nothing"}, {""}},
                            {{"Wait"}, {""}},
                            {{"Do something"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"5"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"Seems like no other choice right now"}, {""}},
                            {{"Seems like no other choice right now"}, {""}},
                            {{"Seems like no other choice right now"}, {""}}
                    }
            },

            //Scenario Level 48
            {
                    {//question
                            {{"The person comes in the room, they see you standing up feeling unsteady. You aren't feeling too good and don't know what to do next. "}, {""}}
                    },
                    {//options
                            {{"Do nothing"}, {""}},
                            {{"Wait to see what he does"}, {""}},
                            {{"Wait to see what he says"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"10"}},
                            {{"Neg"}, {"5"}},
                            {{"Neg"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You are in serious danger "}, {""}},
                            {{"This isn't the best idea but there are not \n" +
                                    "many other choices right now"}, {""}},
                            {{"You want to let him speak."}, {""}}
                    }
            },

            //Scenario Level 49
            {
                    {//question
                            {{"You start to feel dizzy, your legs begin to wobble and you could collapse at any moment. The stress and lack of energy is coming down on you."}, {""}}
                    },
                    {//options
                            {{"Ignore this feeling"}, {""}},
                            {{"Sit down"}, {""}},
                            {{"Try to stable your balance"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"15"}},
                            {{"Neg"}, {"5"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Water"}, {""}},
                            {{"Water"}, {""}},
                            {{"Water"}, {""}}
                    },
                    {//result dialog
                            {{"You fall over and feel like you have lost your\n" +
                                    "energy. "}, {""}},
                            {{"You don't want to let him know you're\n" +
                                    "feeling weak and decide to keep standing."}, {""}},
                            {{"You were able to keep steady. "}, {""}}
                    }
            },

            //Scenario Level 50
            {
                    {//question
                            {{"You slowly move backwards and step into rope that was set as a trap. The rope then tightens around your ankle and drags you all the way outside. You close your eyes while being dragged. "}, {""}}
                    },
                    {//options
                            {{"Give up your soul"}, {""}},
                            {{"Open your eyes"}, {""}},
                            {{"Keep your eyes closed"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"50"}},
                            {{"Neg"}, {"30"}},
                            {{"Pos"}, {"5"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You couldn't take it anymore, it was all just too\n" +
                                    "much in the end."}, {""}},
                            {{"You wanted to see for the last time before\n" +
                                    "you lose your life.  "}, {""}},
                            {{"You don't want to look at the spirits, \n" +
                                    "you must stay focused"}, {""}}
                    }
            },

            //Scenario Level 51
            {
                    {//question
                            {{"He forces your eyes open, the spirits touch you and your soul leaves your body "}, {""}}
                    },
                    {//options
                            {{"Go to hell"}, {""}},
                            {{"Go to limbo"}, {""}},
                            {{"Go to heaven"}, {""}}
                    },
                    {//answer effects
                            {{"Neg"}, {"50"}},
                            {{"Pos"}, {"10"}},
                            {{"Pos"}, {"50"}},
                    },
                    {//answer types
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}},
                            {{"Sanity"}, {""}}
                    },
                    {//result dialog
                            {{"You were in a dark place, all you could feel was\n" +
                                    "pain. Seeing so many lost lives and constantly\n" +
                                    "trying to survive has made you insane.  "}, {""}},
                            {{"You were indecisive throughout this\n" +
                                    "journey and you still are! At least you are\n" +
                                    "in a better place now! "}, {""}},
                            {{"You were strong throughout this\n" +
                                    "journey, you deserve to rest and relax\n" +
                                    "in paradise. "}, {""}}
                    }
            },

    };


    public String getQuestionData(int a, int b, int c, int d, int e) {
        String question = GameDataArray[a][b][c][d][e];
        return question;
    }

}
