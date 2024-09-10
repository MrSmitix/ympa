-module(ympa_erlang_client_full_outlet_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_full_outlet_dto/0]).

-type ympa_erlang_client_full_outlet_dto() ::
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
       'storagePeriod' => integer(),
       'id' => integer(),
       'status' => ympa_erlang_client_outlet_status_type:ympa_erlang_client_outlet_status_type(),
       'region' => ympa_erlang_client_region_dto:ympa_erlang_client_region_dto(),
       'shopOutletId' => binary(),
       'workingTime' => binary(),
       'moderationReason' => binary()
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
          'storagePeriod' := StoragePeriod,
          'id' := Id,
          'status' := Status,
          'region' := Region,
          'shopOutletId' := ShopOutletId,
          'workingTime' := WorkingTime,
          'moderationReason' := ModerationReason
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
       'storagePeriod' => StoragePeriod,
       'id' => Id,
       'status' => Status,
       'region' => Region,
       'shopOutletId' => ShopOutletId,
       'workingTime' => WorkingTime,
       'moderationReason' => ModerationReason
     }.
