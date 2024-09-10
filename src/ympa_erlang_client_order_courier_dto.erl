-module(ympa_erlang_client_order_courier_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_courier_dto/0]).

-type ympa_erlang_client_order_courier_dto() ::
    #{ 'fullName' => binary(),
       'phone' => binary(),
       'phoneExtension' => binary(),
       'vehicleNumber' => binary(),
       'vehicleDescription' => binary()
     }.

encode(#{ 'fullName' := FullName,
          'phone' := Phone,
          'phoneExtension' := PhoneExtension,
          'vehicleNumber' := VehicleNumber,
          'vehicleDescription' := VehicleDescription
        }) ->
    #{ 'fullName' => FullName,
       'phone' => Phone,
       'phoneExtension' => PhoneExtension,
       'vehicleNumber' => VehicleNumber,
       'vehicleDescription' => VehicleDescription
     }.
