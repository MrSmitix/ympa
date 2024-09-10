
/*
 * OfferCardRecommendationType.h
 *
 * Рекомендация по дополнению или замене контента. Не возвращается для карточек, которые заполнены Маркетом или содержат бывшие в употреблении товары.  Часть рекомендаций относятся к **основным параметрам**, которые есть у товаров любых категорий. Другие — к тем **характеристикам**, которые есть у товара потому, что он относится к определенной категории.  **1. Рекомендации, относящиеся к основным параметрам**  Каждая такая рекомендация относится к **единственному параметру**. Чтобы заполнить этот параметр, пользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  Рекомендации по заполнению параметров в &#x60;updateOfferMappings&#x60;:  * &#x60;RECOGNIZED_VENDOR&#x60; — напишите название производителя так, как его пишет сам производитель (параметр &#x60;vendor&#x60;). * &#x60;PICTURE_COUNT&#x60; — добавьте изображения (параметр &#x60;pictures&#x60;). * &#x60;FIRST_PICTURE_SIZE&#x60; — замените первое изображение более крупным (параметр &#x60;pictures&#x60;). * &#x60;TITLE_LENGTH&#x60; — измените название (параметр &#x60;name&#x60;). Составьте название по схеме: тип + бренд или производитель + модель + особенности, если есть (размер, вес, цвет). * &#x60;DESCRIPTION_LENGTH&#x60; — добавьте описание рекомендуемого размера (параметр &#x60;description&#x60;). * &#x60;AVERAGE_PICTURE_SIZE&#x60; — замените все изображения на изображения высокого качества (параметр &#x60;pictures&#x60;). * &#x60;FIRST_VIDEO_LENGTH&#x60; — добавьте первое видео рекомендуемой длины (параметр &#x60;videos&#x60;). * &#x60;AVERAGE_VIDEO_SIZE&#x60; — замените все видео на видео высокого качества (параметр &#x60;videos&#x60;). * &#x60;VIDEO_COUNT&#x60; — добавьте больше видео (параметр &#x60;videos&#x60;).  Рекомендуемые значения параметров описаны в [Справке Яндекс Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/add/).  **2. Рекомендации, относящиеся к характеристикам по категориям**  Каждая такая рекомендация предполагает заполнение **одной или нескольких характеристик**. Чтобы узнать, какие именно характеристики нужно заполнить, воспользуйтесь запросом [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). Например, если вы получили рекомендацию &#x60;MAIN&#x60;, нужно заполнить характеристики, имеющие &#x60;MAIN&#x60; в массиве &#x60;recommendationTypes&#x60;.  Рекомендации:  * &#x60;MAIN&#x60; — заполните ключевые характеристики товара, которые используются в поиске и фильтрах. * &#x60;ADDITIONAL&#x60; — заполните дополнительные характеристики товара. * &#x60;DISTINCTIVE&#x60; — заполните характеристики, которыми отличаются друг от друга варианты товара.  **3. Устаревшие рекомендации**  * &#x60;HAS_VIDEO&#x60;. * &#x60;FILTERABLE&#x60;. * &#x60;HAS_DESCRIPTION&#x60;. * &#x60;HAS_BARCODE&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_OfferCardRecommendationType_H_
#define TINY_CPP_CLIENT_OfferCardRecommendationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Рекомендация по дополнению или замене контента. Не возвращается для карточек, которые заполнены Маркетом или содержат бывшие в употреблении товары.  Часть рекомендаций относятся к **основным параметрам**, которые есть у товаров любых категорий. Другие — к тем **характеристикам**, которые есть у товара потому, что он относится к определенной категории.  **1. Рекомендации, относящиеся к основным параметрам**  Каждая такая рекомендация относится к **единственному параметру**. Чтобы заполнить этот параметр, пользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  Рекомендации по заполнению параметров в `updateOfferMappings`:  * `RECOGNIZED_VENDOR` — напишите название производителя так, как его пишет сам производитель (параметр `vendor`). * `PICTURE_COUNT` — добавьте изображения (параметр `pictures`). * `FIRST_PICTURE_SIZE` — замените первое изображение более крупным (параметр `pictures`). * `TITLE_LENGTH` — измените название (параметр `name`). Составьте название по схеме: тип + бренд или производитель + модель + особенности, если есть (размер, вес, цвет). * `DESCRIPTION_LENGTH` — добавьте описание рекомендуемого размера (параметр `description`). * `AVERAGE_PICTURE_SIZE` — замените все изображения на изображения высокого качества (параметр `pictures`). * `FIRST_VIDEO_LENGTH` — добавьте первое видео рекомендуемой длины (параметр `videos`). * `AVERAGE_VIDEO_SIZE` — замените все видео на видео высокого качества (параметр `videos`). * `VIDEO_COUNT` — добавьте больше видео (параметр `videos`).  Рекомендуемые значения параметров описаны в [Справке Яндекс Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/add/).  **2. Рекомендации, относящиеся к характеристикам по категориям**  Каждая такая рекомендация предполагает заполнение **одной или нескольких характеристик**. Чтобы узнать, какие именно характеристики нужно заполнить, воспользуйтесь запросом [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). Например, если вы получили рекомендацию `MAIN`, нужно заполнить характеристики, имеющие `MAIN` в массиве `recommendationTypes`.  Рекомендации:  * `MAIN` — заполните ключевые характеристики товара, которые используются в поиске и фильтрах. * `ADDITIONAL` — заполните дополнительные характеристики товара. * `DISTINCTIVE` — заполните характеристики, которыми отличаются друг от друга варианты товара.  **3. Устаревшие рекомендации**  * `HAS_VIDEO`. * `FILTERABLE`. * `HAS_DESCRIPTION`. * `HAS_BARCODE`. 
 *
 *  \ingroup Models
 *
 */

class OfferCardRecommendationType{
public:

    /*! \brief Constructor.
	 */
    OfferCardRecommendationType();
    OfferCardRecommendationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferCardRecommendationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferCardRecommendationType_H_ */
