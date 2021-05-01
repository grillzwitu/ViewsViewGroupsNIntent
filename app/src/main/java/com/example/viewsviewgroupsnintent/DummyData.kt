package com.example.viewsviewgroupsnintent

object DummyData {
    val facts = listOf<FactModel>(
        FactModel(
            "Kotlin",
            R.drawable.kotlin_logo,
            "Andrey Breslav mentioned that the team decided to name it after an island, just like Java was named after the Indonesian island of Java (though the programming language Java was perhaps named after the coffee)."
        ),
        FactModel(
            "Java",
            R.drawable.java_logo,
            "The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee. Java is also an island in indonesia."
        ),
        FactModel(
            "Python",
            R.drawable.python_logo,
            "At the time of developing the language, Van Rossum was also reading the published scripts from “Monty Python's Flying Circus”, a BBC comedy series from the 1970s. Van Rossum thought he needed a name that was short, unique, and slightly mysterious, so he decided to call the language Python."
        ),
        FactModel(
            "Javascript",
            R.drawable.javascript_logo,
            "The name Javascript came from Netscape's support of Java Applets within its browser"
        ),
        FactModel(
            "PHP",
            R.drawable.php_logo,
            "PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor. PHP code is usually processed on a web server by a PHP interpreter implemented as a module, a daemon or as a Common Gateway Interface (CGI) executable."
        )

    )
}