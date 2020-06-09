var container, controls;

var camera = null;
var scene = null;
var renderer = null;

var mouseX = 0,
	mouseY = 0;

var windowHalfX = 600;
var windowHalfY = 500;

var object1 = null;
var id = null;

var mtl = "yhcp.mtl";
var obj = "yhcp.obj";
var path = "../../../../moban4454/3dmodel/yhcp/";
var initial = 50; //数值越小，模型越大
var position_z = 250;
var minDistance = 100; //数值越小，放大比例越大
var maxDistance = 450; //数值越大，缩小比例约小

function clearModel() {
	// 清除局部的模型
	if(scene !== null) {
		// 确保3D相关对象已销毁
		window.cancelAnimationFrame(stop) // 可以取消动画
		scene = null
		camera = null
		renderer = null
		controls = null
		div3D = null
	}
}

function init() {

	clearModel();

	renderer = new THREE.WebGLRenderer({
		antialias: true,
		canvas: document.getElementById('mainCanvas')
	});
	// windowHalfX = $('mainCanvas').width;
	console.log($('#canvas_div').width() + "+++++++++++++++")
	console.log($('#canvas_div').height() + "+++++++++++++++")
	var windowHalfX = $('#canvas_div').width();
	var windowHalfY = $('#canvas_div').width();
	camera = new THREE.PerspectiveCamera(initial, windowHalfX / windowHalfY, 1, 2000);
	camera.position.z = position_z;

	// scene

	scene = new THREE.Scene();

	//				var ambientLight = new THREE.AmbientLight( 0x523318);
	//				scene.add( ambientLight );
	var ambientLight1 = new THREE.AmbientLight(0xffffff);
	scene.add(ambientLight1);

	var pointLight = new THREE.PointLight(0xffffff);
	if(mtl != 'yxs.mtl') {
		pointLight.position.set(-1.288, 1.942, -3.340);
		pointLight.intensity = 0.1;
		pointLight.decay = 2;
	} else {
		pointLight.intensity = 1;
	}

	camera.add(pointLight);

	scene.add(camera);

	//加载进度
	function onProgress(xhr) {

		if(xhr.lengthComputable) {

			var percentComplete = xhr.loaded / xhr.total * 100;
			var progress = Math.round(percentComplete, 2);
			document.getElementById('baifenbi').innerHTML = Math.round(percentComplete, 2) + "%";
			if(progress == 100) {
				document.getElementById('loading1').style.visibility = "hidden";
			}

			//						console.log( 'model ' + Math.round( percentComplete, 2 ) + '% downloaded' );
		}
	}

	function onError() {}

	//				THREE.Loader.Handlers.add( /\.dds$/i, new THREE.DDSLoader() );

	new THREE.MTLLoader()
		.setPath(path)
		.load(mtl, function(materials) {

			materials.preload();

			new THREE.OBJLoader()
				.setMaterials(materials)
				.setPath(path)
				.load(obj, function(object) {

					//								object.position.y = - 95;

					scene.add(object);
				}, onProgress, onError);

		});
	//

	//				renderer = new THREE.WebGLRenderer({antialias: false,
	//                      alpha: false});
	renderer.setPixelRatio(window.devicePixelRatio);
	renderer.setSize(windowHalfX, windowHalfY);
	//设置颜色
	renderer.setClearColor('rgb(131,128,129)', 1.0);
	//				container.appendChild( renderer.domElement );

	// 拖拽
	controls = new THREE.OrbitControls(camera, renderer.domElement); 
	controls.autoRotate = true;
	controls.autoRotateSpeed = 0.5;
	controls.minDistance = minDistance;
	controls.maxDistance = maxDistance;
    controls.autoRotateSpeed = 0.5;

	window.addEventListener('mousemove', onDocumentMouseMove, false);
	window.addEventListener('resize', onWindowResize, false);
	animate();
}

function onDocumentMouseMove(event) {

	mouseX = (event.clientX - windowHalfX) / 2;
	mouseY = (event.clientY - windowHalfY) / 2;

}

function onWindowResize() {

	camera.aspect = windowHalfX / windowHalfY;
	camera.updateProjectionMatrix();

	renderer.setSize(windowHalfX, windowHalfY);

}

function animate() {

	controls.update();
	renderer.render(scene, camera);

	requestAnimationFrame(animate);
}

function render() {

	camera.position.x += (mouseX - camera.position.x) * .05;
	camera.position.y += (-mouseY - camera.position.y) * .05;

	camera.lookAt(scene.position);
}