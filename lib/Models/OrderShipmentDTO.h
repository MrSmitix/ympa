
/*
 * OrderShipmentDTO.h
 *
 * Список посылок.  В параметре может указываться несколько посылок. 
 */

#ifndef TINY_CPP_CLIENT_OrderShipmentDTO_H_
#define TINY_CPP_CLIENT_OrderShipmentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderParcelBoxDTO.h"
#include "OrderTrackDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список посылок.  В параметре может указываться несколько посылок. 
 *
 *  \ingroup Models
 *
 */

class OrderShipmentDTO{
public:

    /*! \brief Constructor.
	 */
    OrderShipmentDTO();
    OrderShipmentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderShipmentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор посылки, присвоенный Маркетом.
	 */
	long getId();

	/*! \brief Set Идентификатор посылки, присвоенный Маркетом.
	 */
	void setId(long  id);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getShipmentDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setShipmentDate(std::string  shipmentDate);
	/*! \brief Get **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
	 */
	std::string getShipmentTime();

	/*! \brief Set **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
	 */
	void setShipmentTime(std::string  shipmentTime);
	/*! \brief Get **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
	 */
	std::list<OrderTrackDTO> getTracks();

	/*! \brief Set **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
	 */
	void setTracks(std::list <OrderTrackDTO> tracks);
	/*! \brief Get Список грузовых мест.
	 */
	std::list<OrderParcelBoxDTO> getBoxes();

	/*! \brief Set Список грузовых мест.
	 */
	void setBoxes(std::list <OrderParcelBoxDTO> boxes);


    private:
    long id{};
    std::string shipmentDate{};
    std::string shipmentTime{};
    std::list<OrderTrackDTO> tracks;
    std::list<OrderParcelBoxDTO> boxes;
};
}

#endif /* TINY_CPP_CLIENT_OrderShipmentDTO_H_ */
