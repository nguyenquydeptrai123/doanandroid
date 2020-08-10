package tdc.edu.vn.qlsv.GiaoDien;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tdc.edu.vn.qlsv.Adapter.CustomAdapterMain;
import tdc.edu.vn.qlsv.Database.DataCTSD;
import tdc.edu.vn.qlsv.Database.DataLoaiThietBi;
import tdc.edu.vn.qlsv.Database.DataPhongHoc;
import tdc.edu.vn.qlsv.Database.DataThietBi;
import tdc.edu.vn.qlsv.Model.Main;
import tdc.edu.vn.qlsv.R;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> data;
    ArrayList<Main> dataUI;
    RecyclerView list;
    CustomAdapterMain adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTaoDuLieu();
        adapter=new CustomAdapterMain(R.layout.list_custom_main,dataUI);

        list.setAdapter(adapter);
        adapter.setListener(new CustomAdapterMain.ListenerMain() {
            @Override
            public void onClick(int position) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this,ActivityLoaiThietBi.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,ActivityThietBi.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,ActivityChiTietSD.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,ActivityPhongHoc.class));
                        break;
                }
            }
        });
    }

    private void setControl() {
        list=findViewById(R.id.list_hienThiDS);
        list.setLayoutManager(new LinearLayoutManager(this));
        data=new ArrayList<>();
        dataUI=new ArrayList<>();
    }

    private void khoiTaoDuLieu(){
        data.add("Thêm lớp");
        data.add("Thêm Môn học");
        data.add("Thêm Điểm");
        data.add("Thêm Học sinh");
        int countMaThietBi=new DataLoaiThietBi(this).getCountLTB();
        int countThietBi=new DataThietBi(this).getCountTB();
        int countPhongHoc=new DataPhongHoc(this).getCountPhongHoc();
        int countCTSD=new DataCTSD(this).getCountCTSD();
        dataUI.add(new Main(R.drawable.mathietbi,"Lớp",countMaThietBi,Color.parseColor("#00e5ff")));
        dataUI.add(new Main(R.drawable.thietbi,"Môn học",countThietBi, Color.parseColor("#c6f68d")));
        dataUI.add(new Main(R.drawable.chitietsudung,"Điểm",countCTSD, Color.parseColor("#90ee02")));
        dataUI.add(new Main(R.drawable.phonghoc,"Học Sinh",countPhongHoc, Color.parseColor("#ffc77d")));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnExit:
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Thông Báo");
                builder.setMessage("Bạn có muốn đăng xuất không ?");
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       startActivity(new Intent(MainActivity.this,DangNhap.class));
                    }
                });
                builder.create().show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

}
