let inputwidth;
let inputheigth;
inputwidth = prompt('nhập chiều rộng');
inputheigth = prompt('nhập chiều cao');
//chuyển dữ liệu kiểu chuổi sang số
let width = parseInt(inputwidth);
let height = parseInt(inputheigth);
let area = width * height;
document.write('diện tích của hình:'+ area);