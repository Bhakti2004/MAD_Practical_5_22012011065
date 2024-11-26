package com.example.mad_practical_5_22012011065

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_practical_5_22012011065.screen.Login
import com.example.mad_practical_5_22012011065.screen.RegisterPage
@Composable
fun AppNavigation()
{
    val navController = rememberNavController()
    NavHost(
        navController=navController,
        startDestination = "login")
    {
        composable("login"){
            Login(onSignUpClick = {
                navController.navigate("register")
            }) }
        composable("register"){
            RegisterPage(onLoginClick = {
                navController.navigate("login")
            }) } }}
