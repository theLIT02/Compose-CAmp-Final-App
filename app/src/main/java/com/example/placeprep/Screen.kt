package com.example.placeprep

sealed class Screen(val route : String){
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen")

    object LanguageFundamental : Screen(route = "language_fundamental")
    object ProblemSolving : Screen(route = "Problem_Solving")
    object ProjectPage : Screen(route = "Project_Page")
    object CoreSubjects : Screen(route = "Core_Subjects")
    object Other : Screen(route = "Other_Screen")


    object OperatingSystemLink : Screen(route = "Operating_System_Link")
    object DBMSLink : Screen(route = "DBMS_Link")
    object ComputerNetworkingLink : Screen(route = "Computer_Networking_link")
    object SystemDesignLink : Screen(route = "System_Design_link")

    object PythonLink : Screen(route = "Python_Link")
    object CppLink : Screen(route = "Cpp_Link")
    object JavaLink : Screen(route ="Java_Link")
    object CLink : Screen(route = "C_Link")

    object AlgorithmLink : Screen(route = "Algo_Link")
    object CPLink : Screen(route = "CP_Link")
    object DPLink : Screen(route = "DP_Link")
    object DataStructureLink : Screen(route = "Data_Structure_Link")

    object MachineLearningLink : Screen(route = "Machine_Learning_Link")
    object AndroidLink : Screen(route = "Android_Link")
    object WebLink : Screen(route = "Web_Link")
    object FlutterLink : Screen(route = "Flutter_Link")



}
