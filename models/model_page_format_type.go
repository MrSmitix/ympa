package models
// PageFormatType : Размещение ярлыков на странице: * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
type PageFormatType string

// List of PageFormatType
const (
	A7 PageFormatType = "A7"
	A4 PageFormatType = "A4"
)
