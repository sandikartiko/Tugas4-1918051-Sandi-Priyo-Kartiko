package com.example.tugas4_recycleview;

public class game {
        private String namagame,idgame,namaid;
        private int logo;
        public game(String namagame, String idgame, String namaid, int logo){
            this.namagame = namagame;
            this.idgame = idgame;
            this.namaid = namaid;
            this.logo= logo ;
        }
        public String getNamagame(){
            return namagame;
        }
        public void setNamagame(String namagame){
            this.namagame = namagame;
        }
        public String getIdgame(){
            return idgame;
        }
        public void setIdgame(String idgame){
            this.idgame = idgame;
        }
        public String getNamaid(){
            return namaid;
        }
        public void setNamaid(String namaid){
            this.namaid = namaid;
        }
    public int getLogo(){
        return logo;
    }
    public void setILogo(int logo){
        this.logo = logo;
    }
    }

