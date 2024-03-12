## jgrep
<img src='https://github.com/allylavanda/jgrep/blob/main/img/icon.jpg' width='100'>

Hello and welcome to my solution I'm working on to add an equivalent tool to grep to windows, jgrep! This is called jgrep since I'll be programming this in java as it is currently my most proficient language. I found that I use windows subsystem for linux on a near daily basis, so I decided to make my own solution for it for fun! This is being made using JDK21
## What is grep?
Grep is a command-line tool built into the linux kernel. It gives us the ability to search for files, and to search the contents of files for patterns.
For more information, see here: https://www.gnu.org/software/grep/manual/grep.html


## Usage
- `java -jar jgrep.jar "cd (directory to search in)" "string in file name"` - search only the directory given
- `java -jar jgrep.jar "(h or help)"` - give user link to documentation for help

## Current Featureset
- Search provided directory for any files with given String and list back to user

## Planned Features
- Ability to search sub-directories
- Ability to edit file names
- Ability to search through files for given string, display what line it's on, which file it's from and path to the file to the user
