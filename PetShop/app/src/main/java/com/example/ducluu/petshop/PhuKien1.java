package com.example.ducluu.petshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class PhuKien1 extends AppCompatActivity {
    ListView lviewThongBao;
    ArrayList<spSanPham> arrayTB;
    SanPhamAdapter adapter ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_phukien);
        anhxa();
       adapter = new SanPhamAdapter(this, R.layout.dong_sanpham, arrayTB);
        lviewThongBao.setAdapter(adapter);
        BottomNavigationView bt  = findViewById(R.id.bottom_navigation);

        bt.setSelectedItemId(R.id.navigation_notifications);

        bt.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.navigation_home:
                        Intent trangchu = new Intent(PhuKien1.this, TrangChu.class);
                        startActivity(trangchu);
                        break;
                    case R.id.navigation_cart:
                        Intent giohang = new Intent(PhuKien1.this,GioHang.class);
                        startActivity(giohang);
                        break;
                    case R.id.navigation_chat:
                        Intent trochuyen = new Intent(PhuKien1.this,TroChuyen.class);
                        startActivity(trochuyen);
                        break;
                    case R.id.navigation_notifications:

                        break;
                    case R.id.navigation_person:
                        Intent canhan = new Intent(PhuKien1.this,NguoiDung.class);
                        startActivity(canhan);
                        break;

                }


                return true;
            }
        });
    }
private void anhxa(){
        lviewThongBao =(ListView) findViewById(R.id.lvThongBao);
        arrayTB = new ArrayList<>();
        arrayTB.add(new spSanPham("L???ng chim","??3.400.000","l???ng chim cho chim t??? 300g", R.drawable.cho1));
    arrayTB.add(new spSanPham("v??ng c??? ch??","??3.400.000","V??ng c??? cho ch??", R.drawable.cho1));
    arrayTB.add(new spSanPham("H??? c??","??3.400.000","h??? c?? b???ng k??nh ch??a ??c 10 l??t n?????c", R.drawable.cho1));
}
}
