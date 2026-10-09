The files inside this directory will be copied from the linux subsystem used to run the commands.

# responses to the questions
### Q1.

```ansible all -i inventories/setup.yml -m setup -a "filter=ansible_distribution*"```

- ansible | binary to be executed
- all | host to connect to (here use all inside /etc/ansible/hosts)(more : https://docs.ansible.com/projects/ansible/latest/inventory_guide/intro_inventory.html#default-groups)
- -i [Path] | inventories -> managing the hosts to be connected to.
- -m [module] | Executes the specified module on the chosen hosts.
- -a [args] | Additionnal arguments given to the module.

### Q2.