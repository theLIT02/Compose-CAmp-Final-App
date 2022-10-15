package com.example.placeprep

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.placeprep.components.Main
import com.example.placeprep.screens.*
import com.example.placeprep.screens.links.*

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.Home.route){

        composable(
            route = Screen.Home.route

        ){
            Main(navController = navController)
        }

        composable(
            route = Screen.Detail.route
        ){
            CSE_Page()
        }
        composable(
            route = Screen.LanguageFundamental.route
        ){
            Language_Fundamental_Page(navController = navController)
        }
        composable(
            route = Screen.ProblemSolving.route
        ){
            Problem_Solving_Page(navController = navController)
        }
        composable(
            route = Screen.ProjectPage.route
        ){
            Projects_Page(navController = navController)
        }
        composable(
            route = Screen.CoreSubjects.route
        
        ){
            Core_Subjects(navController = navController)
        }
        composable(
            route = Screen.Other.route
        ){
            Others_Page(navController = navController)
        }




        composable(
            route = Screen.OperatingSystemLink.route
        ){
            Operating_System(navController = navController)
        }
        
        composable(
            route = Screen.DBMSLink.route
        ){
            DBMS_Link(navController = navController)
        }
        composable(
            route = Screen.ComputerNetworkingLink.route
        ){
            Computer_Networking(navController = navController)
        }
        composable(
            route = Screen.SystemDesignLink.route
        ){
            System_Design_Link(navController = navController)
        }
        
        
        composable(
            route = Screen.PythonLink.route
        ){
            PythonLinks(navController = navController)
        }
        composable(
            route = Screen.CppLink.route
        ){
            CppLink(navController = navController)
        }
        composable(
            route = Screen.JavaLink.route
        ){
            JavaLink(navController = navController)
        }
        composable(
            route = Screen.CLink.route
        ){
            CLink(navController = navController)
        }
        
        composable(
            route = Screen.AlgorithmLink.route
        ){
            AlgoLink(navController = navController)
        }
        composable(
            route = Screen.CPLink.route
        ){
            CPLink(navController = navController)
        }
        composable(
            route = Screen.DPLink.route
        ){
            DPLink(navController = navController)
        }
        composable(
            route = Screen.DataStructureLink.route
        ){
            DSALink(navController = navController)
        }
        
        composable(
            route = Screen.MachineLearningLink.route
        ){
            MLLink(navController = navController)
        }
        composable(
            route = Screen.AndroidLink.route
        ){
            AndroidLink(navController = navController)
        }
        composable(
            route = Screen.WebLink.route
        ){
            WebLink(navController = navController)
        }
        composable(
            route = Screen.FlutterLink.route
        ){
            FlutterLink(navController = navController)
        }
        
    }
    
}