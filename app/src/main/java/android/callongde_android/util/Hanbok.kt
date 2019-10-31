package android.callongde_android.util

class Hanbok {
    var item_id: Int = 0
    var hanbok_name: String? = null
    var market_name: String? = null
    var rent_time: String? = null
    var price: String? = null
    var sale_yesno: Int = 0
    var sale_percent: Int = 0
    var sale_price: String? = null
    var sharon_like: Int = 0
    var market_img: String? = null
    var hanbok_img1: String? = null
    var hanbok_img2: String? = null
    var hanbok_img3: String? = null
    var keyword1: String? = null
    var keyword2: String? = null
    var keyword3: String? = null
    var keyword4: String? = null
    var keyword5: String? = null
    var keyword6: String? = null
    var get_item: String? = null
    var item_explain: String? = null
    var size_table: String? = null
    var market_address: String? = null
    var opening_time: String? = null
    var website: String? = null
    var contact_number: String? = null
    var words: String? = null
    var kakao_talk: Int = 0


    // 데이터 저장할 시에 사용
    constructor(
        hanbok_name: String,
        market_name: String,
        rent_time: String,
        price: String,
        sale_yesno: Int,
        sale_percent: Int,
        sale_price: String,
        sharon_like: Int,
        market_img: String,
        hanbok_img1: String,
        hanbok_img2: String,
        hanbok_img3: String,
        keyword1: String,
        keyword2: String,
        keyword3: String,
        keyword4: String,
        keyword5: String,
        keyword6: String,
        get_item: String,
        item_explain: String,
        size_table: String,
        market_address: String,
        opening_time: String,
        website: String,
        contact_number: String,
        kakao_talk: Int,
        words: String
    ) {
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.rent_time = rent_time
        this.price = price
        this.sale_yesno = sale_yesno
        this.sale_percent = sale_percent
        this.sale_price = sale_price
        this.sharon_like = sharon_like
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.hanbok_img2 = hanbok_img2
        this.hanbok_img3 = hanbok_img3
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        this.keyword4 = keyword4
        this.keyword5 = keyword5
        this.keyword6 = keyword6
        this.get_item = get_item
        this.item_explain = item_explain
        this.size_table = size_table
        this.market_address = market_address
        this.opening_time = opening_time
        this.website = website
        this.contact_number = contact_number
        this.kakao_talk = kakao_talk
        this.words = words
    }

    // 값 불러올 때 사용
    constructor(
        item_id: Int,
        hanbok_name: String,
        market_name: String,
        rent_time: String,
        price: String,
        sale_yesno: Int,
        sale_percent: Int,
        sale_price: String,
        sharon_like: Int,
        market_img: String,
        hanbok_img1: String,
        hanbok_img2: String,
        hanbok_img3: String,
        keyword1: String,
        keyword2: String,
        keyword3: String,
        keyword4: String,
        keyword5: String,
        keyword6: String,
        get_item: String,
        item_explain: String,
        size_table: String,
        market_address: String,
        opening_time: String,
        website: String,
        contact_number: String,
        kakao_talk: Int,
        words: String
    ) {
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.rent_time = rent_time
        this.price = price
        this.sale_yesno = sale_yesno
        this.sale_percent = sale_percent
        this.sale_price = sale_price
        this.sharon_like = sharon_like
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.hanbok_img2 = hanbok_img2
        this.hanbok_img3 = hanbok_img3
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        this.keyword4 = keyword4
        this.keyword5 = keyword5
        this.keyword6 = keyword6
        this.get_item = get_item
        this.item_explain = item_explain
        this.size_table = size_table
        this.market_address = market_address
        this.opening_time = opening_time
        this.website = website
        this.contact_number = contact_number
        this.kakao_talk = kakao_talk
        this.words = words
    }

    constructor(
        hanbok_name: String,
        hanbok_img1: String
    ) {
        this.hanbok_name = hanbok_name
        this.hanbok_img1 = hanbok_img1
    }
}
/*

class Hanbok {
    var item_id: Int = 0
    var hanbok_name: String? = null
    var market_name: String? = null
    var rent_time: String? = null
    var price: String? = null
    var sale_yesno: Int = 0
    var sale_percent: Int = 0
    var sale_price: String? = null
    var sharon_like: Int = 0
    var market_img: String? = null
    var hanbok_img1: String? = null
    var hanbok_img2: String? = null
    var hanbok_img3: String? = null
    var keyword1: String? = null
    var keyword2: String? = null
    var keyword3: String? = null
    var keyword4: String? = null
    var keyword5: String? = null
    var keyword6: String? = null
    var get_item: String? = null
    var item_explain: String? = null
    var size_table: String? = null
    var market_address: String? = null
    var opening_time: String? = null
    var website: String? = null
    var contact_number: String? = null
    var kakao_talk: Int = 0
    var words: String? = null
    */
/**
     *
     * **//*

    var id: Int = 0
    var productName: String? = null
    var quantity: Int = 0

    */
/*constructor(id: Int, productname: String, quantity: Int) {
        this.id = id
        this.productName = productname
        this.quantity = quantity
    }
*//*

    constructor(productname: String, quantity: Int) {
        this.productName = productname
        this.quantity = quantity
    }

    */
/**
     *
     * **//*


    constructor(
        item_id: Int,
        hanbok_name: String,
        market_name: String,
        market_img: String,
        hanbok_img1: String,
        keyword1: String?,
        keyword2: String?,
        keyword3: String?
    ) {
        this.item_id = item_id
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        // 무궁화 좋아요 갯수도 써주기
    }

    */
/*constructor() {
        this.item_id = item_id
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        // 세일 여부도
        // 무궁화 좋아요 갯수도 써주기
    }*//*


    constructor(
        item_id: Int,
        hanbok_name: String?,
        market_name: String?
    ) {
        this.item_id = item_id
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.rent_time = rent_time
        this.price = price
        this.sale_yesno = sale_yesno
        this.sale_percent = sale_percent
        this.sale_price = sale_price
        this.sharon_like = sharon_like
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.hanbok_img2 = hanbok_img2
        this.hanbok_img3 = hanbok_img3
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        this.keyword4 = keyword4
        this.keyword5 = keyword5
        this.keyword6 = keyword6
        this.get_item = get_item
        this.item_explain = item_explain
        this.size_table = size_table
        this.market_address = market_address
        this.opening_time = opening_time
        this.website = website
        this.contact_number = contact_number
        this.kakao_talk = kakao_talk
        this.words = words
    }

    constructor(
        hanbok_name: String?,
        market_name: String?
    ) {
        this.item_id = item_id
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.rent_time = rent_time
        this.price = price
        this.sale_yesno = sale_yesno
        this.sale_percent = sale_percent
        this.sale_price = sale_price
        this.sharon_like = sharon_like
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.hanbok_img2 = hanbok_img2
        this.hanbok_img3 = hanbok_img3
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        this.keyword4 = keyword4
        this.keyword5 = keyword5
        this.keyword6 = keyword6
        this.get_item = get_item
        this.item_explain = item_explain
        this.size_table = size_table
        this.market_address = market_address
        this.opening_time = opening_time
        this.website = website
        this.contact_number = contact_number
        this.kakao_talk = kakao_talk
        this.words = words
    }

    constructor() {
        this.item_id = item_id
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.rent_time = rent_time
        this.price = price
        this.sale_yesno = sale_yesno
        this.sale_percent = sale_percent
        this.sale_price = sale_price
        this.sharon_like = sharon_like
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.hanbok_img2 = hanbok_img2
        this.hanbok_img3 = hanbok_img3
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        this.keyword4 = keyword4
        this.keyword5 = keyword5
        this.keyword6 = keyword6
        this.get_item = get_item
        this.item_explain = item_explain
        this.size_table = size_table
        this.market_address = market_address
        this.opening_time = opening_time
        this.website = website
        this.contact_number = contact_number
        this.kakao_talk = kakao_talk
        this.words = words
    }

    constructor(
        hanbok_name: String,
        market_name: String,
        rent_time: String,
        price: String,
        sale_yesno: Int,
        sale_percent: Int,
        sale_price: String,
        sharon_like: Int,
        market_img: String,
        hanbok_img1: String,
        hanbok_img2: String,
        hanbok_img3: String,
        keyword1: String,
        keyword2: String,
        keyword3: String,
        keyword4: String,
        keyword5: String,
        keyword6: String,
        get_item: String,
        item_explain: String,
        size_table: String,
        market_address: String,
        opening_time: String,
        website: String,
        contact_number: String,
        kakao_talk: Int,
        words: String
    ) {
        this.item_id = item_id
        this.hanbok_name = hanbok_name
        this.market_name = market_name
        this.rent_time = rent_time
        this.price = price
        this.sale_yesno = sale_yesno
        this.sale_percent = sale_percent
        this.sale_price = sale_price
        this.sharon_like = sharon_like
        this.market_img = market_img
        this.hanbok_img1 = hanbok_img1
        this.hanbok_img2 = hanbok_img2
        this.hanbok_img3 = hanbok_img3
        this.keyword1 = keyword1
        this.keyword2 = keyword2
        this.keyword3 = keyword3
        this.keyword4 = keyword4
        this.keyword5 = keyword5
        this.keyword6 = keyword6
        this.get_item = get_item
        this.item_explain = item_explain
        this.size_table = size_table
        this.market_address = market_address
        this.opening_time = opening_time
        this.website = website
        this.contact_number = contact_number
        this.kakao_talk = kakao_talk
        this.words = words
    }
}*/
