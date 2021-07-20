package com.example.caracterprofilediabloiii;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PDiabloIIIAdapter PDiabloIIIAdapter;
    private List<Caracter> listCaracterView = new ArrayList<>();

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        PDiabloIIIAdapter = new PDiabloIIIAdapter(this, listCaracterView);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(PDiabloIIIAdapter);
        CaracterPrepare();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void CaracterPrepare() {
        Caracter data = new Caracter(R.mipmap.barbarian, "Barbarian", "Force: 150", "Dexterity: 35", "Intelligence: 30", "Vitality: 55", "Damage: 190", "Recovery: 65");
        listCaracterView.add(data);
        data = new Caracter(R.mipmap.crusader, "Crusader", "Force: 135", "Dexterity: 60", "Intelligence: 66", "Vitality: 50", "Damage: 126", "Recovery: 60");
        listCaracterView.add(data);
        data = new Caracter(R.mipmap.demon_hunter, "Demon Hunter", "Force: 110", "Dexterity: 75", "Intelligence: 130", "Vitality: 47", "Damage: 130", "Recovery: 80");
        listCaracterView.add(data);
        data = new Caracter(R.mipmap.monk, "Monk", "Force: 100", "Dexterity: 90", "Intelligence: 66", "Vitality: 160", "Damage: 125", "Recovery: 75");
        listCaracterView.add(data);
        data = new Caracter(R.mipmap.necromancer, "Necromancer", "Force: 90", "Dexterity: 135", "Intelligence: 90", "Vitality: 47", "Damage: 30", "Recovery: 90");
        listCaracterView.add(data);
        data = new Caracter(R.mipmap.witch_doctor, "Witch Doctor", "Force: 85", "Dexterity: 125", "Intelligence: 90", "Vitality: 47", "Damage: 40", "Recovery: 85");
        listCaracterView.add(data);
        data = new Caracter(R.mipmap.wizard, "Wizard", "Force: 80", "Dexterity: 150", "Intelligence: 66", "Vitality: 95", "Damage: 35", "Recovery: 90");
        listCaracterView.add(data);

        Collections.sort(listCaracterView, new Comparator<Caracter>() {
            @Override
            public int compare(Caracter o1, Caracter o2) {
                return o1.classe.compareTo(o2.classe);
            }
        });
    }
}

        /*final ListView listCaracterView;

        listCaracterView = findViewById(R.id.listCaracterView);
        List<Caracter> lista = returnListCaracter();

        final ArrayAdapter<Caracter> adapterlistCaracter;
        adapterlistCaracter = new ArrayAdapter<Caracter>(this, android.R.layout.simple_list_item_2, lista);
        //simple_expandable_list_item_1

        listCaracterView.setAdapter(adapterlistCaracter);
        listCaracterView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Posição selecionada com toque mais longo: " + position, Toast.LENGTH_LONG).show();
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.activity_dialogcontent);
                dialog.setTitle("Personagens");
                ImageView image = dialog.findViewById(R.id.imageDialog);
                image.setImageResource(R.drawable.diablo_iii);

                dialog.show();

                Button botaoFechar = (Button) dialog.findViewById(R.id.btnFechar);
                botaoFechar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }

    private List<Caracter> returnListCaracter() {
        List<Caracter> listaCaracter = new ArrayList<>();
        listaCaracter.add(new Caracter("Barbarian", 150, 35, 30, 55, 190, 65));
        listaCaracter.add(new Caracter("Crusader", 135, 60, 66, 47, 126, 60));
        listaCaracter.add(new Caracter("Demon Hunter", 110, 75, 130, 47, 130, 80));
        listaCaracter.add(new Caracter("Monk", 100, 90, 66, 160, 125, 75));
        listaCaracter.add(new Caracter("Necromancer", 90, 135, 90, 47, 30, 90));
        listaCaracter.add(new Caracter("Witch Doctor", 85, 125, 90, 47, 40, 85));
        listaCaracter.add(new Caracter("Wizard", 80, 150, 66, 95, 35, 90));

        return listaCaracter;
    }
}
*/