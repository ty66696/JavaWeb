
// each ѭ����������˼
// $(".user .name") ѡ����ѡ��ڵ㣬����һ���ڵ㼯�ϡ�
// each(����ĺ�������Ϊ�ص�����)
// jQuery���ڵ�������ص�������ʱ�򣬻��Զ�������ص���������������
// ��һ������index��ֻ��һ����������:index��Ԫ�ص��±꣬�±��0��ʼ����1������
// �ڶ�������item��ֻ��һ������������item����ľ��Ǽ����еĵ�ǰ��������Ԫ�ء�
//console.log(index)
// item ��dom�ڵ㣨ԭ����JavaScript���󣩡�����jquery���󡣲���ʹ��jQuery����ķ���/������
// ��ô��dom����ת����jQuery����
// item��һ��<a>��ǩ��������dom����dom������innerHTML/innerText���ԣ����Ի�ȡԪ�����ı����ݡ�
// ���µ�˼·����ȡ�����û����ŵ�һ�����鵱�У�Ȼ��������������������������±ꡣ
var arr = new Array()
$(".user .name").each(function(index, item){	
	//console.log(item.innerText)
	// ��ô��dom����ת����jQuery�����أ�
	// $(dom����) ����һ��jQuery����
	// jQuery�������ʹ��jQuery�ķ���/����
	//console.log(index + "=" + $(item).text())
	arr.push($(item).text())
})

console.log(arr.join(","))

// ��������������������Ϊ������±�
var myIndex = Math.round(Math.random() * arr.length)
console.log("�н���������Ӧ�������±꣺" + myIndex)
console.log("�н��������ǣ�" + arr[myIndex])