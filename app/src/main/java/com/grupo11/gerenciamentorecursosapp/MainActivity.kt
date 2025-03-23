package com.grupo11.gerenciamentorecursosapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate chamado no gerenciamento recursos app.")

        // Obtendo o WindowManager do System Service
        val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager

        // Usando o WindowManager para obter o tamanho da tela
        val windowMetrics = windowManager.currentWindowMetrics
        val insets = windowMetrics.windowInsets
            .getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())
        val width = windowMetrics.bounds.width() - insets.left - insets.right
        val height = windowMetrics.bounds.height() - insets.top - insets.bottom
        Log.d("MainActivity", "Largura da tela: $width, Altura da tela: $height")

        // Ajustando o modo de entrada suave
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        val layoutParams = window.attributes
        layoutParams.alpha = 0.5f  // Define a opacidade da janela para 50%
        window.attributes = layoutParams

        // Obtendo aplicativos instalados
        val packageManager = packageManager
        val installedApps = packageManager.getInstalledApplications(PackageManager.GET_META_DATA)

        val appNames = installedApps.map { appInfo ->
            packageManager.getApplicationLabel(appInfo).toString()
        }

        // Configurando o RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AppListAdapter(appNames)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart chamado no gerenciamento recursos app.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume chamado no gerenciamento recursos app.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause chamado no gerenciamento recursos app.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop chamado no gerenciamento recursos app.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy chamado no gerenciamento recursos app.")
    }
}
