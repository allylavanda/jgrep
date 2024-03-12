## jgrep

Hello and welcome to my solution I'm working on to add an equivalent tool to grep to windows, jgrep! This is called jgrep since I'll be programming this in java as it is currently my most proficient language. I found that I use windows subsystem for linux on a near daily basis, so I decided to make my own solution for it for fun!

## Folder Structure

The workspace contains two folders by default, where:

- `jgrep/src`: the folder to maintain sources

Meanwhile, the compiled output files will be generated in the `jgrep/bin` folder by default.

This is being made using JDK21
## Usage
- `java jgrep cd (directory to search in)` - search only the directory given
- `java jgrep (h or help)` - give user link to documentation for help

## Current Featureset
- Search provided directory for any files with given String and list back to user

## Planned Features
- Ability to search sub-directories
- Ability to edit file names
- Ability to search through files for given string, display what line it's on, which file it's from and path to the file to the user
