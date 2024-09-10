-module(ympa_erlang_client_order_delivery_address_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_delivery_address_dto/0]).

-type ympa_erlang_client_order_delivery_address_dto() ::
    #{ 'country' => binary(),
       'postcode' => binary(),
       'city' => binary(),
       'district' => binary(),
       'subway' => binary(),
       'street' => binary(),
       'house' => binary(),
       'block' => binary(),
       'entrance' => binary(),
       'entryphone' => binary(),
       'floor' => binary(),
       'apartment' => binary(),
       'phone' => binary(),
       'recipient' => binary(),
       'gps' => ympa_erlang_client_gps_dto:ympa_erlang_client_gps_dto()
     }.

encode(#{ 'country' := Country,
          'postcode' := Postcode,
          'city' := City,
          'district' := District,
          'subway' := Subway,
          'street' := Street,
          'house' := House,
          'block' := Block,
          'entrance' := Entrance,
          'entryphone' := Entryphone,
          'floor' := Floor,
          'apartment' := Apartment,
          'phone' := Phone,
          'recipient' := Recipient,
          'gps' := Gps
        }) ->
    #{ 'country' => Country,
       'postcode' => Postcode,
       'city' => City,
       'district' => District,
       'subway' => Subway,
       'street' => Street,
       'house' => House,
       'block' => Block,
       'entrance' => Entrance,
       'entryphone' => Entryphone,
       'floor' => Floor,
       'apartment' => Apartment,
       'phone' => Phone,
       'recipient' => Recipient,
       'gps' => Gps
     }.
