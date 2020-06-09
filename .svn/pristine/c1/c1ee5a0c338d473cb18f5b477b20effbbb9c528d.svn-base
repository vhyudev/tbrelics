var mtl = "yhcp.mtl";
var obj = "yhcp.obj";
var path = "3dmodel/yhcp/";
var initial = 50; //数值越小，模型越大
var position_z = 250;
var minDistance = 100; //数值越小，放大比例越大
var maxDistance = 450; //数值越大，缩小比例约小
//type 0:index.html  1:exhibition.html
function changeModel(index,type) {
	var arr = [{
			"name": "清 乾隆款珐琅彩芍药雉鸡图玉壶春瓶",
			"message": "清乾隆款珐琅彩芍药雉鸡图玉壶春瓶，是国宝级文物。高16.3厘米，口径4厘米，底径5厘米。小撇口，长颈，腹部下端丰满，圈足。瓶胎质细腻洁白，胎体轻薄，釉面莹润如玉，上用珐琅彩绘画。颈部用蓝料彩绘上下两组蕉叶纹，腹部珐琅彩绘芍药雉鸡图：两只雌雄雉鸡栖身于山石上，彼此相偎，作态亲昵，周围衬以芍药花及秋季花草。空白处墨彩题诗：“青扶承露蕊，红妥出阑枝。”引首朱文“春和”印，句尾白文“翠铺”朱文“霞映”二方印。瓶底赭彩四字方款“乾隆年制”。这件玉壶春瓶，构图十分精美，芍药雉鸡寓意金鸡富贵，有吉祥的含义。画工精细入微，绘画图案取自清代宫廷画家的手稿。此瓶集诗、书、画、印于一身，有如一幅展开的画卷，称之国宝名副其实。",
			"a_html":"yhcp.html",
			"name_btn":"玉壶春瓶",
			"path":"yhcp/",
			"mtl": "yhcp.mtl",
			"obj": "yhcp.obj",
			"initial":50,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "清 “乾隆御赏”款折方开光人物纹匏[páo]制瓶",
			"message": "通高23.5厘米 上腹宽7.5厘米 下腹宽10.2厘米。模印葫芦器亦称“匏器”，是葫芦经加工，成熟风干后而成。制作者在刚刚成形的小葫芦上套上内壁雕成凹陷花纹的木范或陶范，待秋天果实成熟撑足范模里的所有空间时打碎(打开)外范，晾干以后，就成了具有印成浮雕式阳文的各式葫芦器。得以成型者万中无一。",
			"a_html":"bxhl.html",
			"name_btn":"八仙葫芦",
			"path":"BaXianHuLu_10/",
			"mtl": "HuLu.mtl",
			"obj": "HuLu.obj",
			"initial":90,
			"position_z":250,
			"minDistance":150,
			"maxDistance":450
		},
		{
			"name": "明 荷鱼朱砂澄泥砚",
			"message": "澄泥砚，与端砚、歙砚、洮砚并称为我国四大名砚，以其质地细腻、色泽多变、发墨如油、不损笔毫而颇受历代文人雅士的推崇。此砚作鱼形砚身，呈朱红色，泥质细腻，色泽鲜艳。砚背衬以荷叶，荷叶及鱼周于烧制前均着黑色，黑红相映，荷鱼交辉，浓艳与沉着相得益彰。可谓造型生动活泼，雕刻精细传神，线条流畅自然，色彩鲜丽华美，技法高超，巧夺天工，是极为稀见的古代文房艺术精品。砚背上方隶书：“给谏公赏”；中间另刻楷书小字铭：“离尘垢 伴文人 腹中书满 同上龙门。”落款“宋开蕤”；下方刻有铭文两行：“初颐园大司马赠 宋开莱藏”。",
			"a_html":"yyt.html",
			"name_btn":"澄泥砚",
			"path":"yyt/",
			"mtl": "yyt-remesh.mtl",
			"obj": "yyt-remesh.obj",
			"initial":60,
			"position_z":300,
			"minDistance":200,
			"maxDistance":450
		},
		{
			"name": "明 荷鱼朱砂澄泥砚盒",
			"message": "砚台盒盖之上刻铭文曰：“澄泥荷鱼研 初颐园家旧物，河间吴棠湖购得收藏”。",
			"a_html":"yth.html",
			"name_btn":"澄泥砚盒",
			"path":"yth/",
			"mtl": "up.mtl",
			"obj": "up.obj",
			"initial":75,
			"position_z":250,
			"minDistance":150,
			"maxDistance":450
		},
		{
			"name": "宋 玉双鱼型带饰",
			"message": "",
			"a_html":"",
			"name_btn":"双鱼型带饰",
			"path":"ShuangYu/",
			"mtl": "syy.mtl",
			"obj": "syy.obj",
			"initial":20,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "宋 玉鸡坠饰",
			"message": "",
			"a_html":"",
			"name_btn":"玉鸡坠饰",
			"path":"yuji/",
			"mtl": "xj.mtl",
			"obj": "xj.obj",
			"initial":10,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "辽 三彩印花海棠式盘",
			"message": "",
			"a_html":"",
			"name_btn":"三彩印花海棠式盘",
			"path":"huahaipan/",
			"mtl": "HuaKouPan.mtl",
			"obj": "HuaKouPan.obj",
			"initial":80,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "辽 金玉迦楼罗",
			"message": "",
			"a_html":"",
			"name_btn":"金玉迦楼罗",
			"path":"yxs/",
			"mtl": "yxs.mtl",
			"obj": "yxs.obj",
			"initial":40,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "宋 钧窑玫瑰紫釉葵式三足洗",
			"message": "宋钧窑玫瑰紫釉葵式三足洗，高6.5厘米、口径22.2厘米、底径13.5厘米。葵花瓣口，折沿，浅腹，腹呈六瓣葵花式，三个如意云头形底足。造型端庄、雅致。胎呈灰褐色，器里施天青色釉，釉面上含有“蚯蚓走泥纹”。器外壁为玫瑰紫色乳浊釉，釉汁肥厚，色彩绚丽。外底抹有酱色护胎釉，并刻有“六”字铭款。钧窑中的宫廷用瓷，一般都刻有一到十的数目字，这种数目字是表示器物大小的标志。一号器物最大，十号器物最小。“六”是中等偏小的器物，靠足边处有16个小支钉痕。此种三足洗实际功用是花盆的盆托（盆奁），上面应有对应号码和样式的花盆配合使用。此洗不仅釉色优美，造型也浑厚端庄不失优雅，是北宋钧官窑中的精品，是宋徽宗的最爱。",
			"a_html":"",
			"name_btn":"三足洗",
			"path":"junyao/",
			"mtl": "JunYaoPan.mtl",
			"obj": "JunYaoPan.obj",
			"initial":75,
			"position_z":250,
			"minDistance":150,
			"maxDistance":450
		},
		{
			"name": "宋 汝窑盘",
			"message": "宋（960——1279）高2.8厘米 口径17.2厘米 底径9.2厘米 汝窑为五大名窑之首，窑址在河南省宝丰清凉寺，据考证烧造时间为宋哲宗元祐元年（1086年）到宋徽宗崇宁五年（1106年）二十年间，因烧造时间短，数量少，在南宋时就有“近尤难得”之说。汝窑瓷器如此珍贵，在博物馆界和收藏界无不以收藏到汝瓷为至高荣誉。汝瓷现今传世不足百件，天津博物馆却珍藏着两件汝窑盘，故十分珍贵。盘高2.8厘米，口径17.2厘米，底径9.2厘米。口外撇，曲壁，圈足外卷裹釉。通体天青色釉，釉汁肥厚莹润，釉面上布满了细碎的冰裂纹，如冰似玉，清雅高洁。盘底满釉，一只盘底有三个细小的支钉痕，而另外一只盘底有五个支钉痕。",
			"a_html":"",
			"name_btn":"汝窑盘",
			"path":"ruyao/",
			"mtl": "RuYaoPan.mtl",
			"obj": "RuYaoPan.obj",
			"initial":50,
			"position_z":250,
			"minDistance":150,
			"maxDistance":450
		},
		{
			"name": "金“熟伽泊猛安印”铜印",
			"message": "",
			"a_html":"",
			"name_btn":"熟伽泊猛安印",
			"path":"menganyin/",
			"mtl": "YinZhang_2_WT_10.mtl",
			"obj": "YinZhang_2_WT_10.obj",
			"initial":50,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "金“贞钓五年总押副统之印”铜印",
			"message": "",
			"a_html":"",
			"name_btn":"总押副统之印",
			"path":"futongyin/",
			"mtl": "YinZhang_3_WT_10.mtl",
			"obj": "YinZhang_3_WT_10.obj",
			"initial":50,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		},
		{
			"name": "辽 契丹文大字柄钮铜印",
			"message": "",
			"a_html":"",
			"name_btn":"大字柄钮铜印",
			"path":"bingniutongyin/",
			"mtl": "YinZhang_1_10.mtl",
			"obj": "YinZhang_1_10.obj",
			"initial":50,
			"position_z":250,
			"minDistance":100,
			"maxDistance":450
		}
	];
	var object = arr[index];
	mtl = object.mtl;
	obj = object.obj;
	path = '3dmodel/'+object.path;
	initial = object.initial;
	position_z = object.position_z;
	minDistance = object.minDistance;
	maxDistance = object.maxDistance;
	document.getElementById("name").innerHTML = object.name;
	document.getElementById("message").innerHTML = object.message;
	var a_html = "3dmodel/yyt.html" + '?mtl='+mtl + '&obj='+obj + '&path='+object.path + '&initial=' + initial + '&position_z=' + position_z +'&minDistance='+minDistance +'&maxDistance=' +maxDistance;
	if(type === 0) {
		a_html = 'moban4454/'+a_html;
	}
	document.getElementById("a_html").href = a_html;

	document.getElementById("a_html").innerHTML = object.name_btn;
	
	init();
	document.getElementById('loading').style.visibility = "initial";
	

}