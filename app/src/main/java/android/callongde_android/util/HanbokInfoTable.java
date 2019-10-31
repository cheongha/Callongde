package android.callongde_android.util;/*
package android.callongde_android.util;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

public class HanbokInfoTable {
    public Context context;
    public DatabaseHelper helper;
    public SQLiteDatabase database;

    // 내 테이블 형식대로 바꾸기
    static final String HANBOKINFOCOLUMN =
            "item_id, hanbok_name, market_name, rent_time, price, sale_yesno, sale_percent, sale_price, sharon_like, market_img, hanbok_img1, hanbok_img2, hanbok_img3, keyword1, keyword2, keyword3, keyword4, keyword5, keyword6, get_item, item_explain, size_table, market_address, opening_time, website, contact_number, kakao_talk, words";


    public HanbokInfoTable(Context context){
        this.context = context;
        helper = new DatabaseHelper(context);
        database = helper.getWritableDatabase();
    }

    // 내 엑셀에서
    public void insertData(HanbokDetail hanbokDetail) {

        Log.e("insertData", "insertData호출");

        if (database != null) {
            String sql = "insert or replace into hanbok("+HANBOKINFOCOLUMN+") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Object[] params = {hanbokDetail.item_id, hanbokDetail.hanbok_name, hanbokDetail.market_name, hanbokDetail.rent_time, hanbokDetail.price, hanbokDetail.sale_yesno, hanbokDetail.sale_percent, hanbokDetail.sale_price, hanbokDetail.sharon_like, hanbokDetail.market_img, hanbokDetail.hanbok_img1, hanbokDetail.hanbok_img2, hanbokDetail.hanbok_img3, hanbokDetail.keyword1, hanbokDetail.keyword2, hanbokDetail.keyword3, hanbokDetail.keyword4, hanbokDetail.keyword5, hanbokDetail.keyword6, hanbokDetail.get_item, hanbokDetail.item_explain, hanbokDetail.size_table, hanbokDetail.market_address, hanbokDetail.opening_time, hanbokDetail.website, hanbokDetail.contact_number, hanbokDetail.kakao_talk, hanbokDetail.words };

            database.execSQL(sql, params);

            */
/*Log.e("insertData", hanbokDetail.toString());
            Log.e("insertData11", params.toString());*//*


        }
    }


    public HanbokDetail selectData(int movieIndex) {

        if (database != null) {

            HanbokDetail hanbokDetail;

            String sql = "select "+HANBOKINFOCOLUMN+" from " + "hanbok WHERE movie_index=" + movieIndex;

            // 진짜 커서같은 느낌,
            Cursor cursor = database.rawQuery(sql, null);
            Log.e("조회된 데이터 개수 : ", String.valueOf(cursor.getCount()));

            if (cursor.getCount() == 0) {
                Toast.makeText(context, "어플을 처음 실행 한 경우, 인터넷에 연결해야 데이터를 받아 올 수 있습니다.", Toast.LENGTH_SHORT).show();
            } else {

                // 커서가 다음으로 넘어가도록 한 것
                cursor.moveToNext();
                int item_id = cursor.getInt(0);
                String hanbok_name = cursor.getString(1);
                String market_name = cursor.getString(2);
                String rent_time = cursor.getString(3);
                String price = cursor.getString(4);
                String sale_yesno = cursor.getString(5); // Boolean
                int sale_percent = cursor.getInt(6);
                String sale_price = cursor.getString(7);
                String sharon_like = cursor.getString(8); // Boolean
                String market_img = cursor.getString(9);
                String hanbok_img1 = cursor.getString(10);
                String hanbok_img2 = cursor.getString(11);
                String hanbok_img3 = cursor.getString(12);
                String keyword1 = cursor.getString(13);
                String keyword2 = cursor.getString(14); // Boolean
                String keyword3 = cursor.getString(15);
                String keyword4 = cursor.getString(16);
                String keyword5 = cursor.getString(17);
                String keyword6 = cursor.getString(18);
                String get_item = cursor.getString(19);
                String item_explain = cursor.getString(20);
                String size_table = cursor.getString(21);
                String market_address = cursor.getString(22); // Boolean
                String opening_time = cursor.getString(23);
                String website = cursor.getString(24);
                String contact_number = cursor.getString(25);
                String kakao_talk = cursor.getString(26); // Boolean
                String words = cursor.getString(27);

                hanbokDetail = new HanbokDetail(item_id, hanbok_name, market_name, rent_time, price, sale_yesno, sale_percent, sale_price, sharon_like, market_img, hanbok_img1, hanbok_img2, hanbok_img3, keyword1, keyword2, keyword3, keyword4, keyword5, keyword6, get_item, item_explain, size_table, market_address, opening_time, website, contact_number, kakao_talk, words);
               */
/* Log.e("selectData", image + " " + title + " " + reservation_grade + " " + reservation_rate + " " + grade);*//*

                Log.e("selectData", "안뇽안뇽");

                return hanbokDetail;
            }
        }
        return null;
    }
}
*/
