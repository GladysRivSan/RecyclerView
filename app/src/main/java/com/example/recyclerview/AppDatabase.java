package com.example.recyclerview;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.recyclerview.data.PokemonDao;
import com.example.recyclerview.data.PokemonShort;

@Database(entities = {PokemonShort.class}, version = 1) public abstract class AppDatabase extends RoomDatabase {
    public abstract PokemonDao pokemonDao();
}
