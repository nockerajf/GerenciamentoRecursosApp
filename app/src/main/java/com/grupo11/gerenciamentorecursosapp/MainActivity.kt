package com.grupo11.gerenciamentorecursosapp

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate chamado")

        val packageManager = packageManager
        val installedApps = packageManager.getInstalledApplications(PackageManager.GET_META_DATA)

        val appNames = installedApps.map { appInfo ->
            packageManager.getApplicationLabel(appInfo).toString()
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AppListAdapter(appNames)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy chamado")
    }
}
