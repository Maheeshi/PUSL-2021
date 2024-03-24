package com.example.signlang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PageTwo extends AppCompatActivity implements View.OnClickListener {
    public CardView a, b, c, d, e, f, g, h, i, j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        a = (CardView) findViewById(R.id.l1);
        b = (CardView) findViewById(R.id.l2);
        c = (CardView) findViewById(R.id.l3);
        d = (CardView) findViewById(R.id.l4);
        e = (CardView) findViewById(R.id.l5);
        f = (CardView) findViewById(R.id.l6);
        g = (CardView) findViewById(R.id.l7);
        h = (CardView) findViewById(R.id.l8);
        i = (CardView) findViewById(R.id.l9);
        j = (CardView) findViewById(R.id.l10);
        k = (CardView) findViewById(R.id.l11);
        l = (CardView) findViewById(R.id.l12);
        m = (CardView) findViewById(R.id.l13);
        n = (CardView) findViewById(R.id.l14);
        o = (CardView) findViewById(R.id.l15);
        p = (CardView) findViewById(R.id.l16);
        q = (CardView) findViewById(R.id.l17);
        r= (CardView) findViewById(R.id.l18);
        s = (CardView) findViewById(R.id.l19);
        t = (CardView) findViewById(R.id.l20);
        u = (CardView) findViewById(R.id.l21);
        v = (CardView) findViewById(R.id.l22);
        w = (CardView) findViewById(R.id.l23);
        x= (CardView) findViewById(R.id.l24);
        y = (CardView) findViewById(R.id.l25);
        z = (CardView) findViewById(R.id.l26);

        a.setOnClickListener((View.OnClickListener) this);
        b.setOnClickListener((View.OnClickListener) this);
        c.setOnClickListener((View.OnClickListener) this);
        d.setOnClickListener((View.OnClickListener) this);
        e.setOnClickListener((View.OnClickListener) this);
        f.setOnClickListener((View.OnClickListener) this);
        g.setOnClickListener((View.OnClickListener) this);
        h.setOnClickListener((View.OnClickListener) this);
        i.setOnClickListener((View.OnClickListener) this);
        j.setOnClickListener((View.OnClickListener) this);
        k.setOnClickListener((View.OnClickListener) this);
        l.setOnClickListener((View.OnClickListener) this);
        m.setOnClickListener((View.OnClickListener) this);
        n.setOnClickListener((View.OnClickListener) this);
        o.setOnClickListener((View.OnClickListener) this);
        p.setOnClickListener((View.OnClickListener) this);
        q.setOnClickListener((View.OnClickListener) this);
        r.setOnClickListener((View.OnClickListener) this);
        s.setOnClickListener((View.OnClickListener) this);
        t.setOnClickListener((View.OnClickListener) this);
        u.setOnClickListener((View.OnClickListener) this);
        v.setOnClickListener((View.OnClickListener) this);
        w.setOnClickListener((View.OnClickListener) this);
        x.setOnClickListener((View.OnClickListener) this);
        y.setOnClickListener((View.OnClickListener) this);
        z.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        if (v.getId() == R.id.l1) {
            i = new Intent(this, DisA.class);
            startActivity(i);
        } else if (v.getId() == R.id.l2) {
            i = new Intent(this, DisB.class);
            startActivity(i);
        } else if (v.getId() == R.id.l3) {
            i = new Intent(this, DisC.class);
            startActivity(i);
        } else if (v.getId() == R.id.l4) {
            i = new Intent(this, DisD.class);
            startActivity(i);
        } else if (v.getId() == R.id.l5) {
            i = new Intent(this, DisE.class);
            startActivity(i);
        } else if (v.getId() == R.id.l6) {
            i = new Intent(this, DisF.class);
            startActivity(i);
        } else if (v.getId() == R.id.l7) {
            i = new Intent(this, DisG.class);
            startActivity(i);
        } else if (v.getId() == R.id.l8) {
            i = new Intent(this, DisH.class);
            startActivity(i);
        } else if (v.getId() == R.id.l9) {
            i = new Intent(this, DisI.class);
            startActivity(i);
        } else if (v.getId() == R.id.l10) {
            i = new Intent(this, DisJ.class);
            startActivity(i);
        } else if (v.getId() == R.id.l11) {
            i = new Intent(this, DisK.class);
            startActivity(i);
        } else if (v.getId() == R.id.l12) {
            i = new Intent(this, DisL.class);
            startActivity(i);
        } else if (v.getId() == R.id.l13) {
            i = new Intent(this, DisM.class);
            startActivity(i);
        } else if (v.getId() == R.id.l14) {
            i = new Intent(this, DisN.class);
            startActivity(i);
        } else if (v.getId() == R.id.l15) {
            i = new Intent(this, DisO.class);
            startActivity(i);
        } else if (v.getId() == R.id.l16) {
            i = new Intent(this, DisP.class);
            startActivity(i);
        } else if (v.getId() == R.id.l17) {
            i = new Intent(this, DisQ.class);
            startActivity(i);
        } else if (v.getId() == R.id.l18) {
            i = new Intent(this, DisR.class);
            startActivity(i);
        } else if (v.getId() == R.id.l19) {
            i = new Intent(this, DisS.class);
            startActivity(i);
        } else if (v.getId() == R.id.l20) {
            i = new Intent(this, DisT.class);
            startActivity(i);
        } else if (v.getId() == R.id.l21) {
            i = new Intent(this, DisU.class);
            startActivity(i);
        } else if (v.getId() == R.id.l22) {
            i = new Intent(this, DisV.class);
            startActivity(i);
        } else if (v.getId() == R.id.l23) {
            i = new Intent(this, DisW.class);
            startActivity(i);
        } else if (v.getId() == R.id.l24) {
            i = new Intent(this, DisX.class);
            startActivity(i);
        } else if (v.getId() == R.id.l25) {
            i = new Intent(this, DisY.class);
            startActivity(i);
        } else if (v.getId() == R.id.l26) {
            i = new Intent(this, DisZ.class);
            startActivity(i);
        }
    }
}