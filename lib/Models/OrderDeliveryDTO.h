
/*
 * OrderDeliveryDTO.h
 *
 * Информация о доставке.
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryDTO_H_
#define TINY_CPP_CLIENT_OrderDeliveryDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderCourierDTO.h"
#include "OrderDeliveryAddressDTO.h"
#include "OrderDeliveryDatesDTO.h"
#include "OrderDeliveryDispatchType.h"
#include "OrderDeliveryEacType.h"
#include "OrderDeliveryPartnerType.h"
#include "OrderDeliveryType.h"
#include "OrderLiftType.h"
#include "OrderShipmentDTO.h"
#include "OrderTrackDTO.h"
#include "OrderVatType.h"
#include "RegionDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о доставке.
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryDTO{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryDTO();
    OrderDeliveryDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
	 */
	std::string getId();

	/*! \brief Set Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	OrderDeliveryType getType();

	/*! \brief Set 
	 */
	void setType(OrderDeliveryType  type);
	/*! \brief Get Наименование службы доставки.
	 */
	std::string getServiceName();

	/*! \brief Set Наименование службы доставки.
	 */
	void setServiceName(std::string  serviceName);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
	 */
	long getPrice();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
	 */
	void setPrice(long  price);
	/*! \brief Get 
	 */
	OrderDeliveryPartnerType getDeliveryPartnerType();

	/*! \brief Set 
	 */
	void setDeliveryPartnerType(OrderDeliveryPartnerType  deliveryPartnerType);
	/*! \brief Get 
	 */
	OrderCourierDTO getCourier();

	/*! \brief Set 
	 */
	void setCourier(OrderCourierDTO  courier);
	/*! \brief Get 
	 */
	OrderDeliveryDatesDTO getDates();

	/*! \brief Set 
	 */
	void setDates(OrderDeliveryDatesDTO  dates);
	/*! \brief Get 
	 */
	RegionDTO getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionDTO  region);
	/*! \brief Get 
	 */
	OrderDeliveryAddressDTO getAddress();

	/*! \brief Set 
	 */
	void setAddress(OrderDeliveryAddressDTO  address);
	/*! \brief Get 
	 */
	OrderVatType getVat();

	/*! \brief Set 
	 */
	void setVat(OrderVatType  vat);
	/*! \brief Get Идентификатор службы доставки.
	 */
	long getDeliveryServiceId();

	/*! \brief Set Идентификатор службы доставки.
	 */
	void setDeliveryServiceId(long  deliveryServiceId);
	/*! \brief Get 
	 */
	OrderLiftType getLiftType();

	/*! \brief Set 
	 */
	void setLiftType(OrderLiftType  liftType);
	/*! \brief Get Стоимость подъема на этаж.
	 */
	long getLiftPrice();

	/*! \brief Set Стоимость подъема на этаж.
	 */
	void setLiftPrice(long  liftPrice);
	/*! \brief Get Идентификатор пункта самовывоза, присвоенный магазином.
	 */
	std::string getOutletCode();

	/*! \brief Set Идентификатор пункта самовывоза, присвоенный магазином.
	 */
	void setOutletCode(std::string  outletCode);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getOutletStorageLimitDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setOutletStorageLimitDate(std::string  outletStorageLimitDate);
	/*! \brief Get 
	 */
	OrderDeliveryDispatchType getDispatchType();

	/*! \brief Set 
	 */
	void setDispatchType(OrderDeliveryDispatchType  dispatchType);
	/*! \brief Get Информация для отслеживания перемещений посылки.
	 */
	std::list<OrderTrackDTO> getTracks();

	/*! \brief Set Информация для отслеживания перемещений посылки.
	 */
	void setTracks(std::list <OrderTrackDTO> tracks);
	/*! \brief Get Информация о посылках.
	 */
	std::list<OrderShipmentDTO> getShipments();

	/*! \brief Set Информация о посылках.
	 */
	void setShipments(std::list <OrderShipmentDTO> shipments);
	/*! \brief Get Приблизительная ли дата доставки.
	 */
	bool isEstimated();

	/*! \brief Set Приблизительная ли дата доставки.
	 */
	void setEstimated(bool  estimated);
	/*! \brief Get 
	 */
	OrderDeliveryEacType getEacType();

	/*! \brief Set 
	 */
	void setEacType(OrderDeliveryEacType  eacType);
	/*! \brief Get Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
	 */
	std::string getEacCode();

	/*! \brief Set Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
	 */
	void setEacCode(std::string  eacCode);


    private:
    std::string id{};
    OrderDeliveryType type;
    std::string serviceName{};
    long price{};
    OrderDeliveryPartnerType deliveryPartnerType;
    OrderCourierDTO courier;
    OrderDeliveryDatesDTO dates;
    RegionDTO region;
    OrderDeliveryAddressDTO address;
    OrderVatType vat;
    long deliveryServiceId{};
    OrderLiftType liftType;
    long liftPrice{};
    std::string outletCode{};
    std::string outletStorageLimitDate{};
    OrderDeliveryDispatchType dispatchType;
    std::list<OrderTrackDTO> tracks;
    std::list<OrderShipmentDTO> shipments;
    bool estimated{};
    OrderDeliveryEacType eacType;
    std::string eacCode{};
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryDTO_H_ */
