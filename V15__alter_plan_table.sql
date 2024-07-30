-- change to a number that is not being used to ovoid migration errors
ALTER TABLE plans
DROP COLUMN description,
DROP COLUMN duration_unit,
DROP COLUMN features,
DROP COLUMN duration;
