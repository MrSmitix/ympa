-module(ympa_erlang_client_change_outlet_request).

-export([encode/1]).

-export_type([ympa_erlang_client_change_outlet_request/0]).

-type ympa_erlang_client_change_outlet_request() ::
    #{ 'name' := binary(),
       'type' := ympa_erlang_client_outlet_type:ympa_erlang_client_outlet_type(),
       'coords' => binary(),
       'isMain' => boolean(),
       'shopOutletCode' => binary(),
       'visibility' => ympa_erlang_client_outlet_visibility_type:ympa_erlang_client_outlet_visibility_type(),
       'address' := ympa_erlang_client_outlet_address_dto:ympa_erlang_client_outlet_address_dto(),
       'phones' := list(),
       'workingSchedule' := ympa_erlang_client_outlet_working_schedule_dto:ympa_erlang_client_outlet_working_schedule_dto(),
       'deliveryRules' => list(),
       'storagePeriod' => integer()
     }.

encode(#{ 'name' := Name,
          'type' := Type,
          'coords' := Coords,
          'isMain' := IsMain,
          'shopOutletCode' := ShopOutletCode,
          'visibility' := Visibility,
          'address' := Address,
          'phones' := Phones,
          'workingSchedule' := WorkingSchedule,
          'deliveryRules' := DeliveryRules,
          'storagePeriod' := StoragePeriod
        }) ->
    #{ 'name' => Name,
       'type' => Type,
       'coords' => Coords,
       'isMain' => IsMain,
       'shopOutletCode' => ShopOutletCode,
       'visibility' => Visibility,
       'address' => Address,
       'phones' => Phones,
       'workingSchedule' => WorkingSchedule,
       'deliveryRules' => DeliveryRules,
       'storagePeriod' => StoragePeriod
     }.
