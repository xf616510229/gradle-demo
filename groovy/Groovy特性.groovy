// 1. 可选的分号
println("Hello World")

// 2. 类方法默认public

// 3. 属性会自动添加getter/setter
class User {
    String username
    String password

    @Override
    String toString() {
        final StringBuilder sb = new StringBuilder("User{")
        sb.append("username=").append(username)
        sb.append(", password=").append(password)
        sb.append('}')
        // 最后一个表达式，会被作为return值
        sb.toString()
    }

    void sayHello(String name, String message) {
        assert name!=null && !name.isEmpty()
        assert message!=null && !message.isEmpty()
        println "${username}: HELLO ${name}, ${message}"
    }
}
User user = new User()
user.setUsername("张三")
user.setPassword("123456")
println (user)

// 4. 属性可以使用 点 来获取
println(user.password)


// 5. assert语句
//user.sayHello(null, null)

// 6. 调用方法时，可选的括号
user.sayHello "李四", "今天天气真好"

// 7. 可选的类型定义
def str = "Hello"
println str.class

// 8. 集合API
// 定义一个List
def list = ["A", "B", "C", "D"]
println list.size
// 添加元素
list << "E"
println list
// ArrayList
println list.class
// 定义map
def map = ["A":1, "B":2, "C":3]
println map
// 添加元素
map.D = 2
println map
// 获取元素
println map['D']
println map.D
// LinkedHashMap
println map.getClass()

// 9. 强大的字符串
def str1 = '我是普通字符串'
def str2 = "我是模板字符串${user}"
def str3 = '''我是
多行文本字符串
😄
'''
println str1
println str2
println str3

// 10. 闭包
// 定义闭包函数1
def c1 = {
    v ->
        print "你好，${v}"
}
// 使用闭包函数
def method(Closure closure) {
    closure '大佬'
}

method(c1)