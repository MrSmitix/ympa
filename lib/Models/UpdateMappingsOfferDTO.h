
/*
 * UpdateMappingsOfferDTO.h
 *
 * Информация о товарах в каталоге.
 */

#ifndef TINY_CPP_CLIENT_UpdateMappingsOfferDTO_H_
#define TINY_CPP_CLIENT_UpdateMappingsOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DayOfWeekType.h"
#include "OfferAvailabilityStatusType.h"
#include "OfferProcessingStateDTO.h"
#include "OfferWeightDimensionsDTO.h"
#include "TimePeriodDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о товарах в каталоге.
 *
 *  \ingroup Models
 *
 */

class UpdateMappingsOfferDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateMappingsOfferDTO();
    UpdateMappingsOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMappingsOfferDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
	 */
	std::string getName();

	/*! \brief Set Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
	 */
	void setName(std::string  name);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);
	/*! \brief Get Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
	 */
	std::string getCategory();

	/*! \brief Set Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
	 */
	void setCategory(std::string  category);
	/*! \brief Get Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
	 */
	std::string getVendor();

	/*! \brief Set Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
	 */
	void setVendor(std::string  vendor);
	/*! \brief Get Артикул товара от производителя.
	 */
	std::string getVendorCode();

	/*! \brief Set Артикул товара от производителя.
	 */
	void setVendorCode(std::string  vendorCode);
	/*! \brief Get Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
	 */
	std::string getDescription();

	/*! \brief Set Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setId(std::string  id);
	/*! \brief Get Идентификатор фида.
	 */
	long getFeedId();

	/*! \brief Set Идентификатор фида.
	 */
	void setFeedId(long  feedId);
	/*! \brief Get Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
	 */
	std::list<std::string> getBarcodes();

	/*! \brief Set Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
	 */
	void setBarcodes(std::list <std::string> barcodes);
	/*! \brief Get URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
	 */
	std::list<std::string> getUrls();

	/*! \brief Set URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
	 */
	void setUrls(std::list <std::string> urls);
	/*! \brief Get Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
	 */
	std::list<std::string> getPictures();

	/*! \brief Set Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
	 */
	void setPictures(std::list <std::string> pictures);
	/*! \brief Get Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
	 */
	std::string getManufacturer();

	/*! \brief Set Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
	 */
	void setManufacturer(std::string  manufacturer);
	/*! \brief Get Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
	 */
	std::list<std::string> getManufacturerCountries();

	/*! \brief Set Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
	 */
	void setManufacturerCountries(std::list <std::string> manufacturerCountries);
	/*! \brief Get Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
	 */
	int getMinShipment();

	/*! \brief Set Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
	 */
	void setMinShipment(int  minShipment);
	/*! \brief Get Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
	 */
	int getTransportUnitSize();

	/*! \brief Set Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
	 */
	void setTransportUnitSize(int  transportUnitSize);
	/*! \brief Get Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
	 */
	int getQuantumOfSupply();

	/*! \brief Set Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
	 */
	void setQuantumOfSupply(int  quantumOfSupply);
	/*! \brief Get Срок, за который продавец поставляет товары на склад, в днях.
	 */
	int getDeliveryDurationDays();

	/*! \brief Set Срок, за который продавец поставляет товары на склад, в днях.
	 */
	void setDeliveryDurationDays(int  deliveryDurationDays);
	/*! \brief Get Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
	 */
	int getBoxCount();

	/*! \brief Set Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
	 */
	void setBoxCount(int  boxCount);
	/*! \brief Get Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
	 */
	std::list<std::string> getCustomsCommodityCodes();

	/*! \brief Set Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
	 */
	void setCustomsCommodityCodes(std::list <std::string> customsCommodityCodes);
	/*! \brief Get 
	 */
	OfferWeightDimensionsDTO getWeightDimensions();

	/*! \brief Set 
	 */
	void setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions);
	/*! \brief Get Дни недели, в которые продавец поставляет товары на склад.
	 */
	std::list<DayOfWeekType> getSupplyScheduleDays();

	/*! \brief Set Дни недели, в которые продавец поставляет товары на склад.
	 */
	void setSupplyScheduleDays(std::list <DayOfWeekType> supplyScheduleDays);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
	 */
	int getShelfLifeDays();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
	 */
	void setShelfLifeDays(int  shelfLifeDays);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
	 */
	int getLifeTimeDays();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
	 */
	void setLifeTimeDays(int  lifeTimeDays);
	/*! \brief Get Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
	 */
	int getGuaranteePeriodDays();

	/*! \brief Set Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
	 */
	void setGuaranteePeriodDays(int  guaranteePeriodDays);
	/*! \brief Get 
	 */
	OfferProcessingStateDTO getProcessingState();

	/*! \brief Set 
	 */
	void setProcessingState(OfferProcessingStateDTO  processingState);
	/*! \brief Get 
	 */
	OfferAvailabilityStatusType getAvailability();

	/*! \brief Set 
	 */
	void setAvailability(OfferAvailabilityStatusType  availability);
	/*! \brief Get 
	 */
	TimePeriodDTO getShelfLife();

	/*! \brief Set 
	 */
	void setShelfLife(TimePeriodDTO  shelfLife);
	/*! \brief Get 
	 */
	TimePeriodDTO getLifeTime();

	/*! \brief Set 
	 */
	void setLifeTime(TimePeriodDTO  lifeTime);
	/*! \brief Get 
	 */
	TimePeriodDTO getGuaranteePeriod();

	/*! \brief Set 
	 */
	void setGuaranteePeriod(TimePeriodDTO  guaranteePeriod);
	/*! \brief Get Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
	 */
	std::string getCertificate();

	/*! \brief Set Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
	 */
	void setCertificate(std::string  certificate);


    private:
    std::string name{};
    std::string shopSku{};
    std::string category{};
    std::string vendor{};
    std::string vendorCode{};
    std::string description{};
    std::string id{};
    long feedId{};
    std::list<std::string> barcodes;
    std::list<std::string> urls;
    std::list<std::string> pictures;
    std::string manufacturer{};
    std::list<std::string> manufacturerCountries;
    int minShipment{};
    int transportUnitSize{};
    int quantumOfSupply{};
    int deliveryDurationDays{};
    int boxCount{};
    std::list<std::string> customsCommodityCodes;
    OfferWeightDimensionsDTO weightDimensions;
    std::list<DayOfWeekType> supplyScheduleDays;
    int shelfLifeDays{};
    int lifeTimeDays{};
    int guaranteePeriodDays{};
    OfferProcessingStateDTO processingState;
    OfferAvailabilityStatusType availability;
    TimePeriodDTO shelfLife;
    TimePeriodDTO lifeTime;
    TimePeriodDTO guaranteePeriod;
    std::string certificate{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateMappingsOfferDTO_H_ */
