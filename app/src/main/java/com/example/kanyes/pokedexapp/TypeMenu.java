package com.example.kanyes.pokedexapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckedTextView;

/**
 * Created by Kanyes on 9/19/2017.
 */

public class TypeMenu extends AppCompatActivity implements View.OnClickListener{
    public CheckedTextView normal, fire, fighting, water, psychic, ground, rock, fairy, dragon, poison, electric, grass, bug, flying, ice, dark, ghost, steel;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type_menu);


        normal = (CheckedTextView) findViewById(R.id.normal);
        fire = (CheckedTextView) findViewById(R.id.fire);
        fighting = (CheckedTextView) findViewById(R.id.fighting);
        water = (CheckedTextView) findViewById(R.id.water);
        psychic = (CheckedTextView) findViewById(R.id.psychic);
        ground = (CheckedTextView) findViewById(R.id.ground);
        rock = (CheckedTextView) findViewById(R.id.rock);
        fairy = (CheckedTextView) findViewById(R.id.fairy);
        dragon = (CheckedTextView) findViewById(R.id.dragon);
        poison = (CheckedTextView) findViewById(R.id.poison);
        electric = (CheckedTextView) findViewById(R.id.electric);
        grass = (CheckedTextView) findViewById(R.id.grass);
        bug = (CheckedTextView) findViewById(R.id.bug);
        flying = (CheckedTextView) findViewById(R.id.flying);
        ice = (CheckedTextView) findViewById(R.id.ice);
        dark = (CheckedTextView) findViewById(R.id.dark);
        ghost = (CheckedTextView) findViewById(R.id.ghost);
        steel = (CheckedTextView) findViewById(R.id.steel);

        normal.setOnClickListener(this);
        fire.setOnClickListener(this);
        fighting.setOnClickListener(this);
        water.setOnClickListener(this);
        psychic.setOnClickListener(this);
        ground.setOnClickListener(this);
        rock.setOnClickListener(this);
        fairy.setOnClickListener(this);
        dragon.setOnClickListener(this);
        poison.setOnClickListener(this);
        electric.setOnClickListener(this);
        grass.setOnClickListener(this);
        bug.setOnClickListener(this);
        flying.setOnClickListener(this);
        ice.setOnClickListener(this);
        dark.setOnClickListener(this);
        ghost.setOnClickListener(this);
        steel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.normal:
                normal.setChecked(!normal.isChecked());
                break;
            case R.id.fire:
                fire.setChecked(!fire.isChecked());
                break;
            case R.id.fighting:
                fighting.setChecked(!fighting.isChecked());
                break;
            case R.id.flying:
                flying.setChecked(!flying.isChecked());
                break;
            case R.id.ground:
                ground.setChecked(!ground.isChecked());
                break;
            case R.id.psychic:
                psychic.setChecked(!psychic.isChecked());
                break;
            case R.id.poison:
                poison.setChecked(!poison.isChecked());
                break;
            case R.id.dark:
                dark.setChecked(!dark.isChecked());
                break;
            case R.id.rock:
                rock.setChecked(!rock.isChecked());
                break;
            case R.id.water:
                water.setChecked(!water.isChecked());
                break;
            case R.id.ghost:
                ghost.setChecked(!ghost.isChecked());
                break;
            case R.id.grass:
                grass.setChecked(!grass.isChecked());
                break;
            case R.id.bug:
                bug.setChecked(!bug.isChecked());
                break;
            case R.id.electric:
                electric.setChecked(!electric.isChecked());
                break;
            case R.id.fairy:
                fairy.setChecked(!fairy.isChecked());
                break;
            case R.id.dragon:
                dragon.setChecked(!dragon.isChecked());
                break;
            case R.id.ice:
                ice.setChecked(!ice.isChecked());
                break;
            case R.id.steel:
                steel.setChecked(!steel.isChecked());
                break;

        }

    }
}
