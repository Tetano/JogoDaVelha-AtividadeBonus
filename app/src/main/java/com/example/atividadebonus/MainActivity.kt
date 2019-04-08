package com.example.atividadebonus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.nio.file.Files.size



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var teste = findViewById(R.id.action_bar) as ActionBar
        var btn1 = findViewById(R.id.btn1) as Button
        var btn2 = findViewById(R.id.btn2) as Button
        var btn3 = findViewById(R.id.btn3) as Button
        var btn4 = findViewById(R.id.btn4) as Button
        var btn5 = findViewById(R.id.btn5) as Button
        var btn6 = findViewById(R.id.btn6) as Button
        var btn7 = findViewById(R.id.btn7) as Button
        var btn8 = findViewById(R.id.btn8) as Button
        var btn9 = findViewById(R.id.btn9) as Button
        var btnrt = findViewById(R.id.btnreset) as Button

        var txt = findViewById(R.id.textvez) as TextView
        var txt2 = findViewById(R.id.textwin) as TextView
        //Toast.makeText(
           // getApplicationContext(), "O Jogador X pode realizar sua primeira jogada",
           // Toast.LENGTH_SHORT
        //).show();
        var vetor = Array(3,{CharArray(3)})
        var validador : Boolean = true
       // vetor[1][2] = 'k'
       // btn1.setText(vetor[1][2].toString())
        txt.setText(vezde(validador).toString())
        txt2.setText("Nenhum Vencedor Ainda")

        btn1.setOnClickListener() {
            if (btn1.text.toString().isNullOrEmpty()) {
               if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[0][0] = 'X'
                    btn1.setText("X")
                }
               if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[0][0] = 'O'
                    btn1.setText("O")
                }
              if(haGanhador(vetor)==true){
                  Toast.makeText(
                      getApplicationContext(), "Temos um vencedor",
                      Toast.LENGTH_SHORT
                  ).show();
                  txt2.setText("Temos um vencedor")
               }

                  validador = !validador
                  txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn2.setOnClickListener(){
            if (btn2.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[0][1] = 'X'
                    btn2.setText("X")
                }
                if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[0][1] = 'O'
                    btn2.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn3.setOnClickListener(){
            if (btn3.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[0][2] = 'X'
                    btn3.setText("X")
                }
                if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[0][2] = 'O'
                    btn3.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn4.setOnClickListener(){
            if (btn4.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[1][0] = 'X'
                    btn4.setText("X")
                }
               if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[1][0] = 'O'
                    btn4.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn5.setOnClickListener(){
            if (btn5.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[1][1] = 'X'
                    btn5.setText("X")
                }
               if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[1][1] = 'O'
                    btn5.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn6.setOnClickListener(){
            if (btn6.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[1][2] = 'X'
                    btn6.setText("X")
                }
                if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[1][2] = 'O'
                    btn6.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn7.setOnClickListener(){
            if (btn7.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[2][0] = 'X'
                    btn7.setText("X")
                }
                if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[2][0] = 'O'
                    btn7.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn8.setOnClickListener(){
            if (btn8.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[2][1] = 'X'
                    btn8.setText("X")
                }
               if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[2][1] = 'O'
                    btn8.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
        }
        btn9.setOnClickListener(){
            if (btn9.text.toString().isNullOrEmpty()) {
                if (vezde(validador).equals("Vez do Jogador X")) {
                    vetor[2][2] = 'X'
                    btn9.setText("X")
                }
                if (vezde(validador).equals("Vez do jogador O")) {
                    vetor[2][2] = 'O'
                    btn9.setText("O")
                }
                if(haGanhador(vetor)==true){
                    Toast.makeText(
                        getApplicationContext(), "Temos um vencedor",
                        Toast.LENGTH_SHORT
                    ).show();
                    txt2.setText("Temos um vencedor")
                }

                validador = !validador
                txt.setText(vezde(validador))

            }
            else
                return@setOnClickListener
            btnrt.setOnClickListener(){
                btn1.setText(null)
                btn2.setText(null)
                btn3.setText(null)
                btn4.setText(null)
                btn5.setText(null)
                btn6.setText(null)
                btn7.setText(null)
                btn8.setText(null)
                btn9.setText(null)
                txt2.setText("Sem vencedor")
            }
        }




    }



    fun alternar(bol : Boolean): Boolean {
        var bo : Boolean = false
        if (bol == true) {
            bo = false
        }
        if (bol == false) {
            bo = true
        }
        return bo
    }

    fun vezde(bol : Boolean):String {
        var frase: String = ""
                if (bol == true) {
            frase = "Vez do Jogador X"
        }
       if(bol==false){
            frase = "Vez do jogador O"
        }
        return  frase
    }

    fun haGanhador( tabuleiro: Array<CharArray> = Array(3,{CharArray(3)})): Boolean {
        //Checa X verticalmente
        if (tabuleiro[0][0] === 'X' && tabuleiro[1][0] === 'X' && tabuleiro[2][0] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[0][1] === 'X' && tabuleiro[1][1] === 'X' && tabuleiro[2][1] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[0][2] === 'X' && tabuleiro[1][2] === 'X' && tabuleiro[2][2] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[0][0] === 'X' && tabuleiro[0][1] === 'X' && tabuleiro[0][2] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[1][0] === 'X' && tabuleiro[1][1] === 'X' && tabuleiro[1][2] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[2][0] === 'X' && tabuleiro[2][1] === 'X' && tabuleiro[2][2] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[0][0] === 'X' && tabuleiro[1][1] === 'X' && tabuleiro[2][2] === 'X') {
            println("'X' VENCEU")
            return true
        } else if (tabuleiro[0][2] === 'X' && tabuleiro[1][1] === 'X' && tabuleiro[2][0] === 'X') {
            println("'X' VENCEU")
            return true
        }//Checa X diagonalmente
        //Checa X horizontalmente
        //Checa O verticalmente
        if (tabuleiro[0][0] === 'O' && tabuleiro[1][0] === 'O' && tabuleiro[2][0] === 'O') {
            println("'O' VENCEU")
            return true
        } else if (tabuleiro[0][1] === 'O' && tabuleiro[1][1] === 'O' && tabuleiro[2][1] === 'O') {
            println("'O' VENCEU")
            return true
        } else if (tabuleiro[0][2] === 'O' && tabuleiro[1][2] === 'O' && tabuleiro[2][2] === 'O') {
            println("'O' VENCEU")
            return true
        }

        //Checa O horizontalmente
        if (tabuleiro[0][0] === 'O' && tabuleiro[0][1] === 'O' && tabuleiro[0][2] === 'O') {
            println("'O' VENCEU")
            return true
        } else if (tabuleiro[1][0] === 'O' && tabuleiro[1][1] === 'O' && tabuleiro[1][2] === 'O') {
            println("'O' VENCEU")
            return true
        } else if (tabuleiro[2][0] === 'O' && tabuleiro[2][1] === 'O' && tabuleiro[2][2] === 'O') {
            println("'O' VENCEU")
            return true
        }

        //Checa O diagonalmente
        if (tabuleiro[0][0] === 'O' && tabuleiro[1][1] === 'O' && tabuleiro[2][2] === 'O') {
            println("'O' VENCEU")
            return true
        } else if (tabuleiro[0][2] === 'O' && tabuleiro[1][1] === 'O' && tabuleiro[2][0] === 'O') {
            println("'O' VENCEU")
            return true
        }

        return false
    }
}
