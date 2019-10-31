package android.callongde_android.util

import android.callongde_android.filter.Data.FilterOverviewData
import android.callongde_android.home.Data.HomeOverviewData
import android.callongde_android.mysharon.MySharonOverviewData
import android.callongde_android.search.SearchData
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.Context

class MyDBHandler(
    context: Context, name: String?,
    factory: SQLiteDatabase.CursorFactory?, version: Int
) : SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                TABLE_FINAL_HANBOKS + "("
                + ITEM_ID + " INTEGER PRIMARY KEY,"
                + HANBOK_NAME + " TEXT,"
                + MARKET_NAME + " TEXT,"
                + RENT_TIME + " TEXT,"
                + PRICE + " TEXT,"
                + SALE_YESNO + " INTEGER,"
                + SALE_PERCENT + " INTEGER,"
                + SALE_PRICE + " TEXT,"
                + SHARON_LIKE + " INTEGER,"
                + MARKET_IMG + " TEXT,"
                + HANBOK_IMG1 + " TEXT,"
                + HANBOK_IMG2 + " TEXT,"
                + HANBOK_IMG3 + " TEXT,"
                + KEYWORD1 + " TEXT,"
                + KEYWORD2 + " TEXT,"
                + KEYWORD3 + " TEXT,"
                + KEYWORD4 + " TEXT,"
                + KEYWORD5 + " TEXT,"
                + KEYWORD6 + " TEXT,"
                + GET_ITEM + " TEXT,"
                + ITEM_EXPLAIN + " TEXT,"
                + SIZE_TABLE + " TEXT,"
                + MARKET_ADDRESS + " TEXT,"
                + OPENING_TIME + " TEXT,"
                + WEBSITE + " TEXT,"
                + CONTACT_NUMBER + " TEXT,"
                + KAKAO_TALK + " INTEGER,"
                + WORDS + " TEXT"
                + ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
    }

    override fun onUpgrade(
        db: SQLiteDatabase, oldVersion: Int,
        newVersion: Int
    ) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FINAL_HANBOKS)
        onCreate(db)
    }

    // 데이터베이스 테이블에 값을 넣을 때
    fun addProduct(hanbok: Hanbok) {
        val values = ContentValues()
        values.put(HANBOK_NAME, hanbok.hanbok_name)
        values.put(MARKET_NAME, hanbok.market_name)
        values.put(RENT_TIME, hanbok.rent_time)
        values.put(PRICE, hanbok.price)
        values.put(SALE_YESNO, hanbok.sale_yesno)
        values.put(SALE_PERCENT, hanbok.sale_percent)
        values.put(SALE_PRICE, hanbok.sale_price)
        values.put(SHARON_LIKE, hanbok.sharon_like)
        values.put(MARKET_IMG, hanbok.market_img)
        values.put(HANBOK_IMG1, hanbok.hanbok_img1)
        values.put(HANBOK_IMG2, hanbok.hanbok_img2)
        values.put(HANBOK_IMG3, hanbok.hanbok_img3)
        values.put(KEYWORD1, hanbok.keyword1)
        values.put(KEYWORD2, hanbok.keyword2)
        values.put(KEYWORD3, hanbok.keyword3)
        values.put(KEYWORD4, hanbok.keyword4)
        values.put(KEYWORD5, hanbok.keyword5)
        values.put(KEYWORD6, hanbok.keyword6)
        values.put(GET_ITEM, hanbok.get_item)
        values.put(ITEM_EXPLAIN, hanbok.item_explain)
        values.put(SIZE_TABLE, hanbok.size_table)
        values.put(MARKET_ADDRESS, hanbok.market_address)
        values.put(OPENING_TIME, hanbok.opening_time)
        values.put(WEBSITE, hanbok.website)
        values.put(CONTACT_NUMBER, hanbok.contact_number)
        values.put(KAKAO_TALK, hanbok.kakao_talk)
        values.put(WORDS, hanbok.words)

        val db = this.writableDatabase

        db.insert(TABLE_FINAL_HANBOKS, null, values)
        db.close()
    }



    // 데이터 찾을 때
    fun findProduct(hanbok_name: String): Hanbok? {
        val query =
            "SELECT * FROM $TABLE_FINAL_HANBOKS WHERE $HANBOK_NAME =  \"$hanbok_name\""

        val db = this.writableDatabase
        val cursor = db.rawQuery(query, null)
        var hanbok: Hanbok? = null

        if (cursor.moveToFirst()) {
            cursor.moveToFirst()

            // 불러올 데이터들
            val item_id = cursor.getInt(cursor.getColumnIndex(ITEM_ID))
            val hanbok_name = cursor.getString(cursor.getColumnIndex(HANBOK_NAME))
            val market_name = cursor.getString(cursor.getColumnIndex(MARKET_NAME))
            val rent_time = cursor.getString(cursor.getColumnIndex(RENT_TIME))
            val price = cursor.getString(cursor.getColumnIndex(PRICE))
            val sale_yesno = cursor.getInt(cursor.getColumnIndex(SALE_YESNO))
            val sale_percent = cursor.getInt(cursor.getColumnIndex(SALE_PERCENT))
            val sale_price = cursor.getString(cursor.getColumnIndex(SALE_PRICE))
            val sharon_like = cursor.getInt(cursor.getColumnIndex(SHARON_LIKE))
            val market_img = cursor.getString(cursor.getColumnIndex(MARKET_IMG))
            val hanbok_img1 = cursor.getString(cursor.getColumnIndex(HANBOK_IMG1))
            val hanbok_img2 = cursor.getString(cursor.getColumnIndex(HANBOK_IMG2))
            val hanbok_img3 = cursor.getString(cursor.getColumnIndex(HANBOK_IMG3))
            val keyword1 = cursor.getString(cursor.getColumnIndex(KEYWORD1))
            val keyword2 = cursor.getString(cursor.getColumnIndex(KEYWORD2))
            val keyword3 = cursor.getString(cursor.getColumnIndex(KEYWORD3))
            val keyword4 = cursor.getString(cursor.getColumnIndex(KEYWORD4))
            val keyword5 = cursor.getString(cursor.getColumnIndex(KEYWORD5))
            val keyword6 = cursor.getString(cursor.getColumnIndex(KEYWORD6))
            val get_item = cursor.getString(cursor.getColumnIndex(GET_ITEM))
            val item_explain = cursor.getString(cursor.getColumnIndex(ITEM_EXPLAIN))
            val size_table = cursor.getString(cursor.getColumnIndex(SIZE_TABLE))
            val market_address = cursor.getString(cursor.getColumnIndex(MARKET_ADDRESS))
            val opening_time = cursor.getString(cursor.getColumnIndex(OPENING_TIME))
            val website = cursor.getString(cursor.getColumnIndex(WEBSITE))
            val contact_number = cursor.getString(cursor.getColumnIndex(CONTACT_NUMBER))
            val kakao_talk = cursor.getInt(cursor.getColumnIndex(KAKAO_TALK))
            val words = cursor.getString(cursor.getColumnIndex(WORDS))

            hanbok = Hanbok(item_id, hanbok_name, market_name, rent_time, price, sale_yesno, sale_percent, sale_price, sharon_like, market_img,
                hanbok_img1, hanbok_img2, hanbok_img3, keyword1, keyword2, keyword3, keyword4, keyword5, keyword6, get_item,item_explain, size_table, market_address,
                opening_time, website, contact_number, kakao_talk, words)
            cursor.close()
        }
        db.close()
        return hanbok
    }

    fun listOfmySearch(): ArrayList<android.callongde_android.search.SearchData>  {
        val db = this.writableDatabase
        val res = db.rawQuery("select * from " + TABLE_FINAL_HANBOKS, null)
        val searchList = ArrayList<android.callongde_android.search.SearchData>()
        while (res.moveToNext()) {
            var search = android.callongde_android.search.SearchData()
            search.hanbok_img = res.getString(10)
            search.hanbok_name = res.getString(1)
            search.market_name = res.getString(2)
            search.rent_time = res.getInt(3)
            search.price = res.getString(4)
            search.like_sharon = res.getInt(8)

            searchList.add(search)
        }
        return searchList
    }

    fun listOfmyPick(): ArrayList<MySharonOverviewData>  {
        val db = this.writableDatabase
        val res = db.rawQuery("select * from " + TABLE_FINAL_HANBOKS, null)
        val mypickList = ArrayList<MySharonOverviewData>()
        while (res.moveToNext()) {
            var mypick = MySharonOverviewData()
            mypick.hanbok_name = res.getString(1)
            mypick.hanbok_img1 = res.getString(10)
            mypickList.add(mypick)
        }
        return mypickList
    }

    fun findMyPickProduct(sharon_like: Int): ArrayList<MySharonOverviewData>  {
        val db = this.writableDatabase
        val mypickList = ArrayList<MySharonOverviewData>()
        val selectQuery =
            "SELECT  * FROM " + TABLE_FINAL_HANBOKS + " WHERE " + SHARON_LIKE + " = '" + sharon_like + "'"
        val cursor = db.rawQuery(selectQuery, null)
        try {

            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                if (cursor.getCount() > 0) {
                    do {
                        var mypick = MySharonOverviewData()
                        mypick.hanbok_name =
                            cursor.getString(cursor.getColumnIndex(HANBOK_NAME))
                        mypick.hanbok_img1 =
                            cursor.getString(cursor.getColumnIndex(HANBOK_IMG1))
                        mypickList.add(mypick)
                    } while ((cursor.moveToNext()));
                }
            }
        } finally {
            cursor.close();
        }
        return mypickList
    }

    fun findSearchProduct(search_txt:String): ArrayList<SearchData>  {
        val db = this.writableDatabase
        val searchList = ArrayList<SearchData>()
        val selectQuery =
            "SELECT  * FROM " + TABLE_FINAL_HANBOKS + " WHERE " + HANBOK_NAME + " = '" + search_txt + "'"
        val cursor = db.rawQuery(selectQuery, null)
        try {

            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                if (cursor.getCount() > 0) {
                    do {
                        var search = SearchData()
                        search.hanbok_img =
                            cursor.getString(cursor.getColumnIndex(HANBOK_IMG1))
                        search.hanbok_name =
                            cursor.getString(cursor.getColumnIndex(HANBOK_NAME))
                        search.market_name =
                            cursor.getString(cursor.getColumnIndex(MARKET_NAME))
                        search.rent_time =
                            cursor.getInt(cursor.getColumnIndex(RENT_TIME))
                        search.price =
                            cursor.getString(cursor.getColumnIndex(PRICE))
                        search.like_sharon =
                            cursor.getInt(cursor.getColumnIndex(SHARON_LIKE))

                        searchList.add(search)
                    } while ((cursor.moveToNext()));
                }
            }
        } finally {
            cursor.close();
        }
        return searchList
    }

    // 홈 프래그먼트 함수
    fun listOfHome(): ArrayList<HomeOverviewData>  {
        val db = this.writableDatabase
        val res = db.rawQuery("select * from " + TABLE_FINAL_HANBOKS, null)
        val homemarketList = ArrayList<HomeOverviewData>()
        while (res.moveToNext()) {
            var homemarket = HomeOverviewData()
            homemarket.item_id = res.getInt(0)
            homemarket.hanbok_img1 = res.getString(10)
            homemarket.market_img = res.getString(9)
            homemarket.hanbok_name = res.getString(1)
            homemarket.market_name = res.getString(2)
            homemarket.keyword1 = res.getString(13)
            homemarket.keyword2 = res.getString(14)
            homemarket.keyword3 = res.getString(15)
            homemarket.sale_yesno = res.getInt(5)

            homemarketList.add(homemarket)
        }
        return homemarketList
    }

    // 필터 프래그먼트 함수
    fun listOfFilter(): ArrayList<FilterOverviewData>  {
        val db = this.writableDatabase
        val res = db.rawQuery("select * from " + TABLE_FINAL_HANBOKS, null)
        val filterList = ArrayList<FilterOverviewData>()
        while (res.moveToNext()) {
            var filter = FilterOverviewData()

            filter.item_id = res.getInt(0)
            filter.hanbok_img = res.getString(10)
            filter.hanbok_name = res.getString(1)
            filter.market_name = res.getString(2)
            filter.rent_time = res.getInt(3)
            filter.price = res.getString(4)
            filter.like_sharon = res.getInt(8)

            filterList.add(filter)
        }
        return filterList
    }
    // 마켓 검색 함수
    /*fun findSearchMarektProduct(search_txt:String): ArrayList<SearchData>  {
        val db = this.writableDatabase
        val searchList = ArrayList<SearchData>()
        val selectQuery =
            "SELECT  * FROM " + TABLE_FINAL_HANBOKS + " WHERE " + MARKET_NAME + " = '" + search_txt + "'"
        val cursor = db.rawQuery(selectQuery, null)
        try {

            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                if (cursor.getCount() > 0) {
                    do {
                        var searchM = SearchData()
                        searchM.hanbok_img =
                            cursor.getString(cursor.getColumnIndex(HANBOK_IMG1))
                        searchM.hanbok_name =
                            cursor.getString(cursor.getColumnIndex(HANBOK_NAME))
                        searchM.market_name =
                            cursor.getString(cursor.getColumnIndex(MARKET_NAME))
                        searchM.rent_time =
                            cursor.getInt(cursor.getColumnIndex(RENT_TIME))
                        searchM.price =
                            cursor.getString(cursor.getColumnIndex(PRICE))
                        searchM.like_sharon =
                            cursor.getInt(cursor.getColumnIndex(SHARON_LIKE))

                        searchList.add(searchM)
                    } while ((cursor.moveToNext()));
                }
            }
        } finally {
            cursor.close();
        }
        return searchList
    }*/

    companion object {
        private val DATABASE_VERSION = 6
        private val DATABASE_NAME = "finalhanboksDB.db"
        val TABLE_FINAL_HANBOKS = "final_hanboks"
        val ITEM_ID = "item_id"
        val HANBOK_NAME = "hanbok_name"
        val MARKET_NAME = "market_name"
        val RENT_TIME = "rent_time"
        val PRICE = "price"
        val SALE_YESNO = "sale_yesno"
        val SALE_PERCENT = "sale_percent"
        val SALE_PRICE = "sale_price"
        val SHARON_LIKE = "sharon_like"
        val MARKET_IMG = "market_img"
        val HANBOK_IMG1 = "hanbok_img1"
        val HANBOK_IMG2 = "hanbok_img2"
        val HANBOK_IMG3 = "hanbok_img3"
        val KEYWORD1 = "keyword1"
        val KEYWORD2 = "keyword2"
        val KEYWORD3 = "keyword3"
        val KEYWORD4 = "keyword4"
        val KEYWORD5 = "keyword5"
        val KEYWORD6 = "keyword6"
        val GET_ITEM = "get_item"
        val ITEM_EXPLAIN = "item_explain"
        val SIZE_TABLE = "size_table"
        val MARKET_ADDRESS = "market_address"
        val OPENING_TIME = "opening_time"
        val WEBSITE = "website"
        val CONTACT_NUMBER = "contact_number"
        val KAKAO_TALK = "kakao_talk"
        val WORDS = "words"
    }

}