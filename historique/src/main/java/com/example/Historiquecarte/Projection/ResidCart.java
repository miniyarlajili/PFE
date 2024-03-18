package com.example.Historiquecarte.Projection;

import java.util.Date;

public interface ResidCart {
    long getcode_reside();

    Date getdate_depart();
    Date getdate_arrive();
    long getmnt_caisse();
    long getcaisse_id();

//r.code_reside,r.date_depart,r.date_arrive,c.mnt_caisse,c.caisse_id
}
