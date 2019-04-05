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


