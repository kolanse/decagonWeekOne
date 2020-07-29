package com.example.decagonweekone



fun checkPalindrome(gotten: String): Boolean {

    val regex = Regex("[^A-Za-z0-9 ]") //A regex filter out all non alphanumeric characters

    var modified: String = regex.replace(gotten, "").replace(" ", "").toLowerCase() // clear out the space and turn all characters to lowercase

    var reversed  = ""



        for (n in modified.length -1 downTo 0) { //loop creates a new string that is a reversed copy of the main string

         reversed += Character.toString(modified.get(n))

        }

        if (modified.equals(reversed)){ //check whether reversed string is equal to the old string
            return true
        }





        return false
    }
