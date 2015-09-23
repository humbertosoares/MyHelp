package shalom.com.br.myhelp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.security.Timestamp;
import java.util.Date;

public class BootUpReceiver extends BroadcastReceiver {

    Date inicio = new Date();


    @Override
    public void onReceive(Context ctx, Intent it) {

        String estado = it.getStringExtra("state");
        String num = it.getStringExtra("incoming_number");

        String msg = null;

        if (estado.equals("RINGING")){
            msg = "O número "+ num +" está chamando.";

        } else if (estado.equals("OFFHOOK")){
            msg = "Início do atendimento às:" + inicio + "horas";

            Intent intent = new Intent(ctx, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            ctx.startActivity(intent);

        } else if (estado.equals("IDLE")){
            if (num != null){
                msg = "Chamada não atendida de "+ num;
            } else {

                msg = "Fim do atendimento às:" + inicio + "horas";
            }
        }

        Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show();
    }
}
