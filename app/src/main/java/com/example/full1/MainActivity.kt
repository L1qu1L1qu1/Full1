package com.example.full1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.full1.ui.theme.Full1Theme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          var scaffoldState = rememberScaffoldState()
            var scope = rememberCoroutineScope()
            var navController = rememberNavController()
            Scaffold(
                scaffoldState = scaffoldState,
                topBar = {
                    TopAppBar {
                        IconButton(onClick = { }) {
                            Icon(Icons.Filled.Info, contentDescription = "Info")
                        }
                        Icon(Icons.Filled.Menu, contentDescription = "Menu")
                            Spacer(Modifier.weight(1f, true))

                            Icon(Icons.Filled.Add, contentDescription = "Add")
                            IconButton(onClick = {scope.launch { scaffoldState.drawerState.open() }}){
                                Icon(Icons.Filled.Search, contentDescription = "Search")
                            }

                    }
                },
                bottomBar = {
                    BottomAppBar {
                        IconButton(onClick = {navController.navigate("One")}) {
                            Icon(Icons.Filled.Menu, contentDescription = "drawer")
                        }
                        Spacer(Modifier.weight(1f, true))
                        IconButton(onClick = {navController.navigate("Two")}) {
                            Icon(Icons.Filled.Search, contentDescription = "drawer")
                        }
                    }
                },
                drawerContent = {
                    Button(onClick = {scope.launch { scaffoldState.drawerState.close() }}) {
                        Text("Back")
                    }
                }


            ) {
                NavHost(navController = navController, startDestination = "One"){
                    composable("One"){ EkranOne (nav = {navController.navigate("Two")})}
                    composable("Two"){ EkranTwo (nav = {navController.navigate("One")}) }
                }
            }
        }
    }
}
@Composable
fun EkranOne(nav:()->Unit){
    Column() {
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
        Text("AAAAAAAAAAAAAAAAAAAA", fontSize = 30.sp)
    }

}
@Composable
fun EkranTwo(nav:()->Unit){
    Column() {
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
        Text("BBBBBBBBBBBBBBBBB", fontSize = 30.sp)
    }


}






