-module(ympa_erlang_client_category_parameter_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_category_parameter_dto/0]).

-type ympa_erlang_client_category_parameter_dto() ::
    #{ 'id' := integer(),
       'name' => binary(),
       'type' := ympa_erlang_client_parameter_type:ympa_erlang_client_parameter_type(),
       'unit' => ympa_erlang_client_category_parameter_unit_dto:ympa_erlang_client_category_parameter_unit_dto(),
       'description' => binary(),
       'recommendationTypes' => list(),
       'required' := boolean(),
       'filtering' := boolean(),
       'distinctive' := boolean(),
       'multivalue' := boolean(),
       'allowCustomValues' := boolean(),
       'values' => list(),
       'constraints' => ympa_erlang_client_parameter_value_constraints_dto:ympa_erlang_client_parameter_value_constraints_dto(),
       'valueRestrictions' => list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'type' := Type,
          'unit' := Unit,
          'description' := Description,
          'recommendationTypes' := RecommendationTypes,
          'required' := Required,
          'filtering' := Filtering,
          'distinctive' := Distinctive,
          'multivalue' := Multivalue,
          'allowCustomValues' := AllowCustomValues,
          'values' := Values,
          'constraints' := Constraints,
          'valueRestrictions' := ValueRestrictions
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'type' => Type,
       'unit' => Unit,
       'description' => Description,
       'recommendationTypes' => RecommendationTypes,
       'required' => Required,
       'filtering' => Filtering,
       'distinctive' => Distinctive,
       'multivalue' => Multivalue,
       'allowCustomValues' => AllowCustomValues,
       'values' => Values,
       'constraints' => Constraints,
       'valueRestrictions' => ValueRestrictions
     }.
