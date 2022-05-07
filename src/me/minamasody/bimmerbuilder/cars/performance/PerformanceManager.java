package me.minamasody.bimmerbuilder.cars.performance;

import me.minamasody.bimmerbuilder.cars.performance.mods.BM3_Tune;
import me.minamasody.bimmerbuilder.cars.performance.mods.Dyno_Tune;
import me.minamasody.bimmerbuilder.cars.performance.mods.JB4_Tune;
import me.minamasody.bimmerbuilder.cars.performance.mods.MHD_Flash_Tune;

import java.util.ArrayList;
import java.util.List;

public class PerformanceManager {

    private static List<PerformanceMod> mods = new ArrayList<>();

    public static List<PerformanceMod> getMods() {
        return mods;
    }

    public static void loadMods(){
        mods.add(new BM3_Tune());
        mods.add(new Dyno_Tune());
        mods.add(new JB4_Tune());
        mods.add(new MHD_Flash_Tune());
    }

    public static PerformanceMod getMod(int id){
        for(PerformanceMod mod : getMods()){
            if(mod.getId() == id){
                return mod;
            }
        }
        return null;
    }


}
