# Week 3
## 24/03/19 - Sunday

Jordan - Setup and connected android studio to github account. The Intro activity is nearly complete, all character images, profiles have
been created using a layout screen activity with viewpager to switch through each characters profile. 

Features added:
- Intro activity screen
- Layout screen (for characters profiles)
- Main activity screen
- Viewpager to switch between character profiles
- Image of characters with their bio / profile description 
- Swipe gesture to switch between characters

Still working on features: 
- SELECT CHARACTER button action to begin a characters storyline
- Create Splashcreen on launch for 4 seconds that includes app title. 
- Hamburger menu to select and edit settings

**Henry: good. But both programmers need contributions if both wants marks for the week (otherwise the only one who worked)**

# Week 4
## 31/03/19 - Sunday

Jordan - Splashscreen activity was created on the launch of the application. It will appear for 5 seconds to give the app time to load files, while loading the logo's animation will run to show the user the app is working and loading.  

Features added:
- Splashscreen activity screen
- Logo of the game on the launch screen
- Name of the app on the launch screen
- 5 second duration timer to load the intro activity screen 

Still working on features: 
- To create an options icon for settings 
- Making individual storylines for characters
- Adding buttons as choices for each characters storyline

## Henry notes
- Missing progress recently (you need to work more days - Deakin requires a minimum 10-14 hours per week per unit). Please update/
- Also say WHO did each task (at the end of the line, add [NAME]), so I can line it up with attendance.php and allocate final marks correctly.

# Week 5
## Henry notes
- Include function comments before each function, in multi-line format /* */

## Daniels Changes
## Thursday + Friday
The following art assets have been uploaded to the drawable/raw folder;
- menutitle.png
- menuplay.png
- menuabout.png
- menusettings.png
- menubackground.png
- background_music.mp4

These assets were created in photoshop and are my own personal creations and can be used without reference.
The Music can be found in the Licence folder.

Changes
- Changed the initial load activity from Splashscreen to the new main menu activity
- Changed style.xml file to no longer display the top bar as it was interfering with game art assets
- Created the menu activity which will be the first point of navigation for players
- Created AboutActivity
- Created SettingsActivity
- Updated background art assets in introActivity
- Changed intro_title_colour to white to better match background
- Added the intro_title_colour color property to intro_description
- Added a MusicService class which is responsible for initiating, pausing, resuming and stopping 

Connected the following Pages
- About Page
- Play Page
- Settings Page

Bug Fixes
- Fixed a bug causing crashes due to code on the character select screen trying to hide the top utility bar even though it did not exist.
- Fixed an issue with the background image being set the the layout screen instead of the activity_intro layout.


# Week 5
## 4/04/19 - Friday / Saturday

Jordan - Fixing up some issues with the activity screens. Ensuring the elements display on different device sizes and buttons are clickable. Adding information to the about us screen and adding buttons and icons to the settings screen. 

Features added:
* About us page complete
* Settings buttons created but no action yet 
* Volume icon on and off

Still working on features:
* Making individual storylines for characters
* Character storylines and choices
* Tap sound on menu buttons
* Playable storyline for 1 character 
* Choice options created
* Different pathway based on choice made
* Comments to be made to all functions in java

Fixed bugs: 
- Splashscreen now loads on launch and sends user to menu screen after 5 seconds. 
- Menu now displays properly for all different screen sizes


# Week 5
## 6/04/19 - Saturday

Jordan - Bugs and errors fixed: 9pm - 11:30pm having a massive error, GitHub was committing and pushing but the committing wasn’t actually committing. Spent 9hrs working on the project 3pm - 11pm.

Features added:
- Storyline for 1 character has been created
- Buttons for choices created
- Hunger percentage level added
- Story java script added
- Added app icons for all device sizes
- About us page is complete
- Settings page: added load & save button, volume button 
- Background music (changed)
- Sound effect for all buttons 

Still working on features: 
- Finishing first story 
- Adding hyperthemria and hydration levels
- Adding a timer to some parts
- Making the duration of the story longer

**We have a weird issue Henry, the background music is still low when I turn it up but for Daniel it's normal volume.**

# Week 5
## 7/04/19 - Sunday [Daniel]

Created and Contributed to Gameplay Planning Document
https://docs.google.com/spreadsheets/d/120B9Wa4GTF05mms-3UFofOC7duH0oNq_vQiT-zvBrvA/edit?usp=sharing

Redesigned core gameplay features and functions. The issues the team ran into and the solutions that were come up with can be found here
https://docs.google.com/document/d/1W-DGNVzojWl2uFtJlTu8Ut5dhOd87au7NwghmlT3_Kc/edit#

The gameplay planning and redesign took up a large amount of Sunday coming up with viable solutions to the design issues.

- Removed fourth decision button due to new game design
- Added Character power button due to new game design
- Reformatted the main gameplay area
- Added background art to the main gameplay area
- Changed text to work with newly updated background
- Added Sanity Resource
- Added Water Resource
- Renamed Hunger to Food
- Renamed Variable mScore to foodValue (new scores made this needed)
- Renamed Score to foodScore
- Added a new HomeStop Class that stops background music when the app is minimized or the phone enters sleep mode
- Added a music pause function to the play button so music stops when the player enters character select
- Disabled the android back button as it would cause issues with future functionality


## 7/04/19 - Sunday [Jordan]

Jordan - I have been working on a google sheet to plan out all 50 parts of the storyline with 3 available choices. These choices will affect the hunger, hydration and sanity levels. 

Features added:
- Halfway finished with the storyline and choice options
- Fixed lag issue by reducing image background
- Downloaded sound effect files for each part of the story


Still working on features: 
- Finish the storyline of the entire game
- Make the hunger, hydration, sanity levels increase / decrease when a choice is chosen
- Each character to have a special ability 
- Add sound effects on each part of the story
- Create a timer 

# Week 6

## 8/04/19 [Henry]
- Good to see progress in general.
- Both of you: function comments. I made a big fuss about this on the unit site last week. [Henry]

# Week 6

# 10/04/19 Wednesday [Jordan]

Jordan - landscape mode now shows all screens properly. The gameplay is now in order and works. 

Features added:
- Reduce background image size
- Update about page
- Story is in order
- Added Icons next to percentages
- Added Background for main activity / gameplay 
- Landscape activity mode for all screens


Still working on features: 
- Save state on rotation
- Percentage levels increase / decrease based on button choice
- Sound effects for each part of the story
- Create timer
- Load / save game 

# 11/04/19 Thursday [Henry]
- Good to see some progress.
- Still missing function comments in places.


# Week 6
## 12/04/19 - Friday [Daniel]

- Fixed an issue with sound not stopping when the play button was pressed
- Added additional function comments
- Extended some function comments that were previously to short for what the fucntion did
- Set up a new class containing a constructor function for the new array system which will be used to load all of the game data for each new question the player is posed with.

Tomorrows work:
- Finish constructor function
- Create Arrray
- Insert all game data into array
- Connect array to the game functions
- Test game to ensure it works

# Week 6
## 13/04/19 - Saturday [Jordan]

Features added:
- SaveInstance State on rotation 

Still working on features: 
- Percentage levels increase / decrease based on button choice
- Sound effects for each part of the story
- Create timer
- Load / save game 


