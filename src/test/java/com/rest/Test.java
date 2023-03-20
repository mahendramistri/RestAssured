package com.rest;

public class Test {

    public static void main(String[] args) {
        System.out.println("My Plalist: "+ getPlaylistInfo().getName());
    }
    public static Playlist getPlaylistInfo(){
        Playlist playlist = new Playlist();
        playlist.setId("001");
        playlist.setName("My fav");
        playlist.setLastname("mistri");
        playlist.setSal(10.45);
        return  playlist;
    }

}
